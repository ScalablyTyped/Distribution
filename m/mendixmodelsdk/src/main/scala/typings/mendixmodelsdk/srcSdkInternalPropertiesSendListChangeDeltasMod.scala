package typings.mendixmodelsdk

import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mobx.distTypesObservablearrayMod.IArrayWillChange
import typings.mobx.distTypesObservablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesSendListChangeDeltasMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/sendListChangeDeltas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
