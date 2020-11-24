package typings.ot

import typings.ot.mod.UndoState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otStrings {
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def redoing: redoing = "redoing".asInstanceOf[redoing]
  
  @scala.inline
  def undoing: undoing = "undoing".asInstanceOf[undoing]
  
  @js.native
  sealed trait normal extends UndoState
  
  @js.native
  sealed trait redoing extends UndoState
  
  @js.native
  sealed trait undoing extends UndoState
}
