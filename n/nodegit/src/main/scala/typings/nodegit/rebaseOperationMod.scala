package typings.nodegit

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`5`
import typings.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rebaseOperationMod {
  
  @JSImport("nodegit/rebase-operation", "RebaseOperation")
  @js.native
  class RebaseOperation () extends StObject {
    
    var exec: String = js.native
    
    var id: Oid = js.native
    
    var `type`: Double = js.native
  }
  object RebaseOperation {
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
    */
    trait REBASE_OPERATION extends StObject
    object REBASE_OPERATION {
      
      @scala.inline
      def EDIT: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def EXEC: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def FIXUP: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def PICK: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def REWORD: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def SQUASH: `3` = 3.asInstanceOf[`3`]
    }
  }
}
