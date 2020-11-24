package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diff extends js.Object {
  
  def getRemoteDiff(callback: js.Function1[/* diff */ js.Object, Unit]): Unit = js.native
  
  def init(): Unit = js.native
  
  def mergeDiff(diff: js.Object): Unit = js.native
  
  def showCommitDiff(options: js.Object): Unit = js.native
  
  def showRemoteDiff(diff: js.Object): Unit = js.native
  
  def showUnifiedDiff(options: js.Object): Unit = js.native
}
object Diff {
  
  @scala.inline
  def apply(
    getRemoteDiff: js.Function1[/* diff */ js.Object, Unit] => Unit,
    init: () => Unit,
    mergeDiff: js.Object => Unit,
    showCommitDiff: js.Object => Unit,
    showRemoteDiff: js.Object => Unit,
    showUnifiedDiff: js.Object => Unit
  ): Diff = {
    val __obj = js.Dynamic.literal(getRemoteDiff = js.Any.fromFunction1(getRemoteDiff), init = js.Any.fromFunction0(init), mergeDiff = js.Any.fromFunction1(mergeDiff), showCommitDiff = js.Any.fromFunction1(showCommitDiff), showRemoteDiff = js.Any.fromFunction1(showRemoteDiff), showUnifiedDiff = js.Any.fromFunction1(showUnifiedDiff))
    __obj.asInstanceOf[Diff]
  }
  
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetRemoteDiff(value: js.Function1[/* diff */ js.Object, Unit] => Unit): Self = this.set("getRemoteDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMergeDiff(value: js.Object => Unit): Self = this.set("mergeDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowCommitDiff(value: js.Object => Unit): Self = this.set("showCommitDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowRemoteDiff(value: js.Object => Unit): Self = this.set("showRemoteDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUnifiedDiff(value: js.Object => Unit): Self = this.set("showUnifiedDiff", js.Any.fromFunction1(value))
  }
}
