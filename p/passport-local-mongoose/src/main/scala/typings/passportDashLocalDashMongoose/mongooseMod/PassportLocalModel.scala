package typings.passportDashLocalDashMongoose.mongooseMod

import typings.passportDashLocal.passportDashLocalMod.Strategy
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// statics
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Model<T> * / any */ @js.native
trait PassportLocalModel[T /* <: Document */] extends js.Object {
  def authenticate(): AuthenticateMethod[T] = js.native
  def createStrategy(): Strategy = js.native
  def deserializeUser(): js.Function2[
    /* username */ String, 
    /* cb */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    Unit
  ] = js.native
  def findByUsername(username: String, selectHashSaltFields: Boolean): js.Any = js.native
  def findByUsername(
    username: String,
    selectHashSaltFields: Boolean,
    cb: js.Function2[/* err */ js.Any, /* account */ js.Any, Unit]
  ): js.Any = js.native
  def register(user: T, password: String): js.Promise[T] = js.native
  def register(user: T, password: String, cb: js.Function2[/* err */ js.Any, /* account */ js.Any, Unit]): Unit = js.native
  def serializeUser(): js.Function2[
    /* user */ PassportLocalModel[T], 
    /* cb */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[js.Any], Unit], 
    Unit
  ] = js.native
}

