package typings.modesl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeslStrings {
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait plain extends js.Object
  
  @js.native
  sealed trait xml extends js.Object
}
