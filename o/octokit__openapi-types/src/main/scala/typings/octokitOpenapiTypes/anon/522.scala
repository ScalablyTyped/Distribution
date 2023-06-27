package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.actions
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.composer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.erlang
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.go
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.other
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pip
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pub
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `522` extends StObject {
  
  var ecosystem: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
  
  /** @description The unique package name within its ecosystem. */
  var name: js.UndefOr[String | Null] = js.undefined
}
object `522` {
  
  inline def apply(
    ecosystem: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
  ): `522` = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[`522`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `522`] (val x: Self) extends AnyVal {
    
    inline def setEcosystem(
      value: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
    ): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
