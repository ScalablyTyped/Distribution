package typings.navigation.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateInfo
  extends /**
  * Gets the additional state attributes
  */
/* extras */ StringDictionary[js.Any] {
  
  /**
    * Gets the default NavigationData Types for  this State
    */
  var defaultTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the default NavigationData for this State
    */
  var defaults: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the unique key
    */
  var key: String = js.native
  
  /**
    * Gets the route Url patterns
    */
  var route: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Gets the textual description of the state
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Gets a value that indicates whether to maintain the crumb trail
    */
  var trackCrumbTrail: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Gets a value that indicates whether NavigationData Types are
    * preserved when navigating
    */
  var trackTypes: js.UndefOr[Boolean] = js.native
}
object StateInfo {
  
  @scala.inline
  def apply(key: String): StateInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInfo]
  }
  
  @scala.inline
  implicit class StateInfoOps[Self <: StateInfo] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTypes(value: js.Any): Self = this.set("defaultTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTypes: Self = this.set("defaultTypes", js.undefined)
    
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setRouteVarargs(value: String*): Self = this.set("route", js.Array(value :_*))
    
    @scala.inline
    def setRoute(value: String | js.Array[String]): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTrackCrumbTrail(value: Boolean | String): Self = this.set("trackCrumbTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackCrumbTrail: Self = this.set("trackCrumbTrail", js.undefined)
    
    @scala.inline
    def setTrackTypes(value: Boolean): Self = this.set("trackTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackTypes: Self = this.set("trackTypes", js.undefined)
  }
}
