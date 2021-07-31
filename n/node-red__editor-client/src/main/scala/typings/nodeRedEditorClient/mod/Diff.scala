package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
  def getRemoteDiff(callback: js.Function1[/* diff */ js.Object, Unit]): Unit
  
  def init(): Unit
  
  def mergeDiff(diff: js.Object): Unit
  
  def showCommitDiff(options: js.Object): Unit
  
  def showRemoteDiff(diff: js.Object): Unit
  
  def showUnifiedDiff(options: js.Object): Unit
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
  implicit class DiffMutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRemoteDiff(value: js.Function1[/* diff */ js.Object, Unit] => Unit): Self = StObject.set(x, "getRemoteDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMergeDiff(value: js.Object => Unit): Self = StObject.set(x, "mergeDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowCommitDiff(value: js.Object => Unit): Self = StObject.set(x, "showCommitDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowRemoteDiff(value: js.Object => Unit): Self = StObject.set(x, "showRemoteDiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowUnifiedDiff(value: js.Object => Unit): Self = StObject.set(x, "showUnifiedDiff", js.Any.fromFunction1(value))
  }
}
