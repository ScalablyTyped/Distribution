package typings.mimeDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sources:
  * http://www.iana.org/assignments/media-types/media-types.xhtml
  * http://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types
  * http://hg.nginx.org/nginx/raw-file/default/conf/mime.types
  */
/* Rewritten from type alias, can be one of: 
  - typings.mimeDb.mimeDbStrings.iana
  - typings.mimeDb.mimeDbStrings.apache
  - typings.mimeDb.mimeDbStrings.nginx
*/
trait MimeSource extends js.Object
object MimeSource {
  
  @scala.inline
  def apache: typings.mimeDb.mimeDbStrings.apache = "apache".asInstanceOf[typings.mimeDb.mimeDbStrings.apache]
  
  @scala.inline
  def iana: typings.mimeDb.mimeDbStrings.iana = "iana".asInstanceOf[typings.mimeDb.mimeDbStrings.iana]
  
  @scala.inline
  def nginx: typings.mimeDb.mimeDbStrings.nginx = "nginx".asInstanceOf[typings.mimeDb.mimeDbStrings.nginx]
}
