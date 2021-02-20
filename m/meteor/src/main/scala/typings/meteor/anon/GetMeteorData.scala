package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMeteorData[TOwnProps, TDataProps] extends StObject {
  
  def getMeteorData(props: TOwnProps): TDataProps = js.native
  
  var pure: js.UndefOr[Boolean] = js.native
}
object GetMeteorData {
  
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => TDataProps): GetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal(getMeteorData = js.Any.fromFunction1(getMeteorData))
    __obj.asInstanceOf[GetMeteorData[TOwnProps, TDataProps]]
  }
  
  @scala.inline
  implicit class GetMeteorDataMutableBuilder[Self <: GetMeteorData[_, _], TOwnProps, TDataProps] (val x: Self with (GetMeteorData[TOwnProps, TDataProps])) extends AnyVal {
    
    @scala.inline
    def setGetMeteorData(value: TOwnProps => TDataProps): Self = StObject.set(x, "getMeteorData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
