package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeItemCollapsibleState extends js.Object
@JSGlobal("TreeItemCollapsibleState")
@js.native
object TreeItemCollapsibleState extends js.Object {
  
  @js.native
  sealed trait Collapsed extends TreeItemCollapsibleState
  
  @js.native
  sealed trait Expanded extends TreeItemCollapsibleState
  
  @js.native
  sealed trait None extends TreeItemCollapsibleState
}
