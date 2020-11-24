package typings.parsePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parsePath.parsePathStrings.http
  - typings.parsePath.parsePathStrings.https
  - typings.parsePath.parsePathStrings.ssh
  - typings.parsePath.parsePathStrings.file
  - typings.parsePath.parsePathStrings.git
*/
trait Protocol extends js.Object
object Protocol {
  
  @scala.inline
  def file: typings.parsePath.parsePathStrings.file = "file".asInstanceOf[typings.parsePath.parsePathStrings.file]
  
  @scala.inline
  def git: typings.parsePath.parsePathStrings.git = "git".asInstanceOf[typings.parsePath.parsePathStrings.git]
  
  @scala.inline
  def http: typings.parsePath.parsePathStrings.http = "http".asInstanceOf[typings.parsePath.parsePathStrings.http]
  
  @scala.inline
  def https: typings.parsePath.parsePathStrings.https = "https".asInstanceOf[typings.parsePath.parsePathStrings.https]
  
  @scala.inline
  def ssh: typings.parsePath.parsePathStrings.ssh = "ssh".asInstanceOf[typings.parsePath.parsePathStrings.ssh]
}
