package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHelperMod {
  
  @JSImport("@peculiar/json-schema/build/types/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkType(value: Any, `type`: JsonPropTypes): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isConvertible(target: Any): /* is @peculiar/json-schema.@peculiar/json-schema/build/types/types.IJsonConvertible<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvertible")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @peculiar/json-schema.@peculiar/json-schema/build/types/types.IJsonConvertible<any> */ Boolean]
  
  inline def throwIfTypeIsWrong(value: Any, `type`: JsonPropTypes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throwIfTypeIsWrong")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
