package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendListChangeDeltasMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/sendListChangeDeltas", JSImport.Namespace)
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
