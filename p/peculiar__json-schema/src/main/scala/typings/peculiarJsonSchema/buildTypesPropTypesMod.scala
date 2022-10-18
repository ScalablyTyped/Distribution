package typings.peculiarJsonSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPropTypesMod {
  
  @js.native
  sealed trait JsonPropTypes extends StObject
  @JSImport("@peculiar/json-schema/build/types/prop_types", "JsonPropTypes")
  @js.native
  object JsonPropTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JsonPropTypes & Double] = js.native
    
    @js.native
    sealed trait Any
      extends StObject
         with JsonPropTypes
    /* 0 */ val Any: typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes.Any & Double = js.native
    
    @js.native
    sealed trait Boolean
      extends StObject
         with JsonPropTypes
    /* 1 */ val Boolean: typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes.Boolean & Double = js.native
    
    @js.native
    sealed trait Number
      extends StObject
         with JsonPropTypes
    /* 2 */ val Number: typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes.Number & Double = js.native
    
    @js.native
    sealed trait String
      extends StObject
         with JsonPropTypes
    /* 3 */ val String: typings.peculiarJsonSchema.buildTypesPropTypesMod.JsonPropTypes.String & Double = js.native
  }
}
