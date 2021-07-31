package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TreeItemCollapsibleState extends StObject
@JSGlobal("TreeItemCollapsibleState")
@js.native
object TreeItemCollapsibleState extends StObject {
  
  @js.native
  sealed trait Collapsed
    extends StObject
       with TreeItemCollapsibleState
  
  @js.native
  sealed trait Expanded
    extends StObject
       with TreeItemCollapsibleState
  
  @js.native
  sealed trait None
    extends StObject
       with TreeItemCollapsibleState
}
