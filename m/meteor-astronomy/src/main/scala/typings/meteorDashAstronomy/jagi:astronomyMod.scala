package typings.meteorDashAstronomy

import typings.meteorDashAstronomy.MeteorAstronomyNs.Class
import typings.meteorDashAstronomy.MeteorAstronomyNs.ClassModel
import typings.meteorDashAstronomy.MeteorAstronomyNs.Enum
import typings.meteorDashAstronomy.MeteorAstronomyNs.EnumModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/jagi:astronomy", JSImport.Namespace)
@js.native
object `jagi:astronomyMod` extends js.Object {
  // tslint:disable-line:no-single-declare-module
  @JSName("Class")
  @js.native
  object ClassNs extends js.Object {
    def create[T /* <: js.Object */](model: ClassModel[T]): Class[T] = js.native
  }
  
  @JSName("Enum")
  @js.native
  object EnumNs extends js.Object {
    def create[T](model: EnumModel[T]): Enum[T] = js.native
  }
  
}

