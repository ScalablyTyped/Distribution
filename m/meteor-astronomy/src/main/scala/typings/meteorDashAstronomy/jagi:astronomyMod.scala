package typings.meteorDashAstronomy

import typings.meteorDashAstronomy.MeteorAstronomy.ClassModel
import typings.meteorDashAstronomy.MeteorAstronomy.EnumModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/jagi:astronomy", JSImport.Namespace)
@js.native
object `jagi:astronomyMod` extends js.Object {
  // tslint:disable-line:no-single-declare-module
  @js.native
  object Class extends js.Object {
    def create[T /* <: js.Object */](model: ClassModel[T]): typings.meteorDashAstronomy.MeteorAstronomy.Class[T] = js.native
  }
  
  @js.native
  object Enum extends js.Object {
    def create[T](model: EnumModel[T]): typings.meteorDashAstronomy.MeteorAstronomy.Enum[T] = js.native
  }
  
}

