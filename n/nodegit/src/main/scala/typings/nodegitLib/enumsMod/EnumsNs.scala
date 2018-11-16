package typings
package nodegitLib.enumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/enums", "Enums")
@js.native
object EnumsNs extends js.Object {
  @js.native
  sealed trait CVAR extends js.Object
  
  @js.native
  sealed trait DIRECTION extends js.Object
  
  @js.native
  sealed trait FEATURE extends js.Object
  
  @js.native
  sealed trait IDXENTRY_EXTENDED_FLAG extends js.Object
  
  @js.native
  sealed trait INDXENTRY_FLAG extends js.Object
  
  @js.native
  object CVAR extends js.Object {
    @js.native
    sealed trait FALSE
      extends nodegitLib.enumsMod.EnumsNs.CVAR
    
    @js.native
    sealed trait INT32
      extends nodegitLib.enumsMod.EnumsNs.CVAR
    
    @js.native
    sealed trait TRUE
      extends nodegitLib.enumsMod.EnumsNs.CVAR
    
    @js.native
    sealed trait string
      extends nodegitLib.enumsMod.EnumsNs.CVAR
    
    /* 0 */ val FALSE: FALSE with scala.Double = js.native
    /* 2 */ val INT32: INT32 with scala.Double = js.native
    /* 1 */ val TRUE: TRUE with scala.Double = js.native
    /* 3 */ val string: string with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.enumsMod.EnumsNs.CVAR with scala.Double] = js.native
  }
  
  @js.native
  object DIRECTION extends js.Object {
    @js.native
    sealed trait FETCH
      extends nodegitLib.enumsMod.EnumsNs.DIRECTION
    
    @js.native
    sealed trait PUSH
      extends nodegitLib.enumsMod.EnumsNs.DIRECTION
    
    /* 0 */ val FETCH: FETCH with scala.Double = js.native
    /* 1 */ val PUSH: PUSH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.enumsMod.EnumsNs.DIRECTION with scala.Double] = js.native
  }
  
  @js.native
  object FEATURE extends js.Object {
    @js.native
    sealed trait HTTPS
      extends nodegitLib.enumsMod.EnumsNs.FEATURE
    
    @js.native
    sealed trait SSH
      extends nodegitLib.enumsMod.EnumsNs.FEATURE
    
    @js.native
    sealed trait THREADS
      extends nodegitLib.enumsMod.EnumsNs.FEATURE
    
    /* 2 */ val HTTPS: HTTPS with scala.Double = js.native
    /* 4 */ val SSH: SSH with scala.Double = js.native
    /* 1 */ val THREADS: THREADS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.enumsMod.EnumsNs.FEATURE with scala.Double] = js.native
  }
  
  @js.native
  object IDXENTRY_EXTENDED_FLAG extends js.Object {
    @js.native
    sealed trait IDXENTRY_ADDED
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_CONFLICTED
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_EXTENDED2
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_HASHED
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_INTENT_TO_ADD
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_NEW_SKIP_WORKTREE
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_REMOVE
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_SKIP_WORKTREE
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_UNHASHED
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_UNPACKED
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_UPDATE
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_UPTODATE
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait IDXENTRY_WT_REMOVE
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    @js.native
    sealed trait S
      extends nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG
    
    /* 8 */ val IDXENTRY_ADDED: IDXENTRY_ADDED with scala.Double = js.native
    /* 128 */ val IDXENTRY_CONFLICTED: IDXENTRY_CONFLICTED with scala.Double = js.native
    /* 32768 */ val IDXENTRY_EXTENDED2: IDXENTRY_EXTENDED2 with scala.Double = js.native
    /* 16 */ val IDXENTRY_HASHED: IDXENTRY_HASHED with scala.Double = js.native
    /* 8192 */ val IDXENTRY_INTENT_TO_ADD: IDXENTRY_INTENT_TO_ADD with scala.Double = js.native
    /* 512 */ val IDXENTRY_NEW_SKIP_WORKTREE: IDXENTRY_NEW_SKIP_WORKTREE with scala.Double = js.native
    /* 2 */ val IDXENTRY_REMOVE: IDXENTRY_REMOVE with scala.Double = js.native
    /* 16384 */ val IDXENTRY_SKIP_WORKTREE: IDXENTRY_SKIP_WORKTREE with scala.Double = js.native
    /* 32 */ val IDXENTRY_UNHASHED: IDXENTRY_UNHASHED with scala.Double = js.native
    /* 256 */ val IDXENTRY_UNPACKED: IDXENTRY_UNPACKED with scala.Double = js.native
    /* 1 */ val IDXENTRY_UPDATE: IDXENTRY_UPDATE with scala.Double = js.native
    /* 4 */ val IDXENTRY_UPTODATE: IDXENTRY_UPTODATE with scala.Double = js.native
    /* 64 */ val IDXENTRY_WT_REMOVE: IDXENTRY_WT_REMOVE with scala.Double = js.native
    /* 24576 */ val S: S with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.enumsMod.EnumsNs.IDXENTRY_EXTENDED_FLAG with scala.Double] = js.native
  }
  
  @js.native
  object INDXENTRY_FLAG extends js.Object {
    @js.native
    sealed trait IDXENTRY_EXTENDED
      extends nodegitLib.enumsMod.EnumsNs.INDXENTRY_FLAG
    
    @js.native
    sealed trait IDXENTRY_VALID
      extends nodegitLib.enumsMod.EnumsNs.INDXENTRY_FLAG
    
    /* 16384 */ val IDXENTRY_EXTENDED: IDXENTRY_EXTENDED with scala.Double = js.native
    /* 32768 */ val IDXENTRY_VALID: IDXENTRY_VALID with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.enumsMod.EnumsNs.INDXENTRY_FLAG with scala.Double] = js.native
  }
  
}

