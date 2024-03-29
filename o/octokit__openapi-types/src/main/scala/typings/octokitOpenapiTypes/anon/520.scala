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

trait `520` extends StObject {
  
  var ecosystem: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
  
  /** @description The unique package name within its ecosystem. */
  var name: String | Null
}
object `520` {
  
  inline def apply(
    ecosystem: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
  ): `520` = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any], name = null)
    __obj.asInstanceOf[`520`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `520`] (val x: Self) extends AnyVal {
    
    inline def setEcosystem(
      value: rubygems | npm | pip | maven | nuget | composer | go | rust | erlang | actions | pub | other
    ): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
  }
}
