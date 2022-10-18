package typings.nivoBullet

import typings.nivoBullet.anon.Id
import typings.nivoBullet.anon.PickCommonBulletPropslayo
import typings.nivoBullet.distTypesTypesMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/bullet/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEnhancedData(data: js.Array[Datum], hasLayoutMaxValueMinValueReverseHeightWidth: PickCommonBulletPropslayo): js.Array[Id] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEnhancedData")(data.asInstanceOf[js.Any], hasLayoutMaxValueMinValueReverseHeightWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Id]]
}
