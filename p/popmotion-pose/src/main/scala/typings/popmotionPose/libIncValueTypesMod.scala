package typings.popmotionPose

import typings.styleValueTypes.libTypesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIncValueTypesMod {
  
  @JSImport("popmotion-pose/lib/inc/value-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("popmotion-pose/lib/inc/value-types", "auto")
  @js.native
  val auto: ValueType = js.native
  
  inline def getValueType(v: Any): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(v.asInstanceOf[js.Any]).asInstanceOf[ValueType]
}
