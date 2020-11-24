package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/blame-hunk", JSImport.Namespace)
@js.native
object blameHunkMod extends js.Object {
  
  @js.native
  class BlameHunk () extends js.Object {
    
    def finalCommitId(): Oid = js.native
    
    def finalSignature(): Signature = js.native
    
    def finalStartLineNumber(): Double = js.native
    
    def linesInHunk(): Double = js.native
    
    def origCommitId(): Oid = js.native
    
    def origPath(): String = js.native
    
    def origSignature(): Signature = js.native
    
    def origStartLineNumber(): Double = js.native
  }
}
