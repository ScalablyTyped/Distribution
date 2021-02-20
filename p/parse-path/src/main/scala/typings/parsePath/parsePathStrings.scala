package typings.parsePath

import typings.parsePath.mod.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsePathStrings {
  
  @js.native
  sealed trait file extends Protocol
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait git extends Protocol
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  
  @js.native
  sealed trait http extends Protocol
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends Protocol
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait ssh extends Protocol
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
}
