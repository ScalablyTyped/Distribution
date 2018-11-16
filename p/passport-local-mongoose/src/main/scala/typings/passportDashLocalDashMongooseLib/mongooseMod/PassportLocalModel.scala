package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// statics
/* RemoveDifficultInheritance: 
- Dropped any */ 
trait PassportLocalModel[T /* <: stdLib.Document */] extends js.Object {
  def authenticate(): js.Function3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* cb */ js.Function3[/* err */ js.Any, /* res */ T, /* error */ js.Any, scala.Unit], 
    scala.Unit
  ]
  def createStrategy(): passportDashLocalLib.passportDashLocalMod.Strategy
  def deserializeUser(): js.Function2[
    /* username */ java.lang.String, 
    /* cb */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  def findByUsername(
    username: java.lang.String,
    selectHashSaltFields: scala.Boolean,
    cb: js.Function2[/* err */ js.Any, /* account */ js.Any, scala.Unit]
  ): js.Any
  def register(
    user: T,
    password: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* account */ js.Any, scala.Unit]
  ): scala.Unit
  def serializeUser(): js.Function2[
    /* user */ PassportLocalModel[T], 
    /* cb */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}

