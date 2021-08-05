package typings.popmotionPose

import typings.styleValueTypes.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueTypesMod {
  
  @JSImport("popmotion-pose/lib/inc/value-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("popmotion-pose/lib/inc/value-types", "auto")
  @js.native
  val auto: ValueType = js.native
  
  inline def getValueType(v: js.Any): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(v.asInstanceOf[js.Any]).asInstanceOf[ValueType]
}
