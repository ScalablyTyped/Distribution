package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", "EnumListProperty")
@js.native
class EnumListProperty[T /* <: mendixmodelsdkLib.distSdkInternalInstancesMod.AbstractEnum */] protected () extends PrimitiveListProperty[T] {
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure, name: java.lang.String, initialValue: js.Array[T], enumType: ScalablyTyped.runtime.Instantiable2[
      /* key */ java.lang.String, 
      /* lifeCycle */ mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.ILifeCycle, 
      mendixmodelsdkLib.distSdkInternalInstancesMod.AbstractEnum
    ]) = this()
  var enumType: ScalablyTyped.runtime.Instantiable2[
    /* key */ java.lang.String, 
    /* lifeCycle */ mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.ILifeCycle, 
    mendixmodelsdkLib.distSdkInternalInstancesMod.AbstractEnum
  ] = js.native
  var initialValue: js.Any = js.native
}

