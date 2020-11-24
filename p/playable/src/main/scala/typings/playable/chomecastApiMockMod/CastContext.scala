package typings.playable.chomecastApiMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.playable.anon.GetMediaSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastContext extends Publisher {
  
  var _estimatedTime: Double = js.native
  
  def getCurrentSession(): GetMediaSession = js.native
  
  def list: StringDictionary[js.Array[js.Function]] = js.native
  
  def setOptions(): Unit = js.native
}
