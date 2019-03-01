package typings
package nssmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nssmLibStrings {
  @js.native
  sealed trait Nssm extends js.Object
  
  @js.native
  sealed trait continue extends Command
  
  @js.native
  sealed trait get extends Command
  
  @js.native
  sealed trait install extends Command
  
  @js.native
  sealed trait pause extends Command
  
  @js.native
  sealed trait remove extends Command
  
  @js.native
  sealed trait reset extends Command
  
  @js.native
  sealed trait restart extends Command
  
  @js.native
  sealed trait rotate extends Command
  
  @js.native
  sealed trait set extends Command
  
  @js.native
  sealed trait start extends Command
  
  @js.native
  sealed trait status extends Command
  
  @js.native
  sealed trait stop extends Command
  
  @scala.inline
  def Nssm: Nssm = "Nssm".asInstanceOf[Nssm]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  @scala.inline
  def rotate: rotate = "rotate".asInstanceOf[rotate]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}

