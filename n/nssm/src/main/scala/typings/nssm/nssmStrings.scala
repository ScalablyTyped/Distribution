package typings.nssm

import typings.nssm.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nssmStrings {
  
  @js.native
  sealed trait continue extends Command
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait get extends Command
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait install extends Command
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  
  @js.native
  sealed trait pause extends Command
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait remove extends Command
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait reset extends Command
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait restart extends Command
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  
  @js.native
  sealed trait rotate extends Command
  @scala.inline
  def rotate: rotate = "rotate".asInstanceOf[rotate]
  
  @js.native
  sealed trait set extends Command
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait start extends Command
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait status extends Command
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stop extends Command
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}
