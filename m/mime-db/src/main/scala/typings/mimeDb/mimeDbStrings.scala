package typings.mimeDb

import typings.mimeDb.mod.MimeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeDbStrings {
  
  @scala.inline
  def apache: apache = "apache".asInstanceOf[apache]
  
  @scala.inline
  def iana: iana = "iana".asInstanceOf[iana]
  
  @scala.inline
  def nginx: nginx = "nginx".asInstanceOf[nginx]
  
  @js.native
  sealed trait apache extends MimeSource
  
  @js.native
  sealed trait iana extends MimeSource
  
  @js.native
  sealed trait nginx extends MimeSource
}
