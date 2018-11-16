package typings
package meteorDashAstronomyLib

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
    def create[T /* <: js.Object */](model: meteorDashAstronomyLib.MeteorAstronomyNs.ClassModel[T]): meteorDashAstronomyLib.MeteorAstronomyNs.Class[T] = js.native
  }
  
  @JSName("Enum")
  @js.native
  object EnumNs extends js.Object {
    def create[T](model: meteorDashAstronomyLib.MeteorAstronomyNs.EnumModel[T]): meteorDashAstronomyLib.MeteorAstronomyNs.Enum[T] = js.native
  }
  
}

