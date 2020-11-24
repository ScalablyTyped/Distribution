package typings.nodePolyglot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralRules extends js.Object {
  
  var pluralTypeToLanguages: StringDictionary[js.Array[String]] = js.native
  
  var pluralTypes: StringDictionary[js.Function1[/* n */ Double, Double]] = js.native
}
object PluralRules {
  
  @scala.inline
  def apply(
    pluralTypeToLanguages: StringDictionary[js.Array[String]],
    pluralTypes: StringDictionary[js.Function1[/* n */ Double, Double]]
  ): PluralRules = {
    val __obj = js.Dynamic.literal(pluralTypeToLanguages = pluralTypeToLanguages.asInstanceOf[js.Any], pluralTypes = pluralTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralRules]
  }
  
  @scala.inline
  implicit class PluralRulesOps[Self <: PluralRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPluralTypeToLanguages(value: StringDictionary[js.Array[String]]): Self = this.set("pluralTypeToLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralTypes(value: StringDictionary[js.Function1[/* n */ Double, Double]]): Self = this.set("pluralTypes", value.asInstanceOf[js.Any])
  }
}
