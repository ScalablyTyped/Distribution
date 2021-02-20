package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeolocationService extends StObject {
  
  def clearWatch(watchID: StringDictionary[js.Any]): Unit = js.native
  
  def getCurrentPosition(): IPromise[IGeoPosition] = js.native
  def getCurrentPosition(options: IGeolocationOptions): IPromise[IGeoPosition] = js.native
  
  def watchPosition(): IPromise[IGeoPosition] = js.native
  def watchPosition(options: IGeolocationOptions): IPromise[IGeoPosition] = js.native
}
