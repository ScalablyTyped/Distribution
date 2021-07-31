package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelGrouping extends StObject {
  
  /** The name to apply to an event that does not match any of the rules in the channel grouping. */
  var fallbackName: js.UndefOr[String] = js.undefined
  
  /** Channel Grouping name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Rules within Channel Grouping. There is a limit of 100 rules that can be set per channel grouping. */
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}
object ChannelGrouping {
  
  @scala.inline
  def apply(): ChannelGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGrouping]
  }
  
  @scala.inline
  implicit class ChannelGroupingMutableBuilder[Self <: ChannelGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackName(value: String): Self = StObject.set(x, "fallbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackNameUndefined: Self = StObject.set(x, "fallbackName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
