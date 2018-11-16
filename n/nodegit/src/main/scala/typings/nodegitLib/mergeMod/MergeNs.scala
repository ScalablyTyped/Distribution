package typings
package nodegitLib.mergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/merge", "Merge")
@js.native
object MergeNs extends js.Object {
  @js.native
  sealed trait ANALYSIS extends js.Object
  
  @js.native
  sealed trait FILE_FAVOR extends js.Object
  
  @js.native
  sealed trait FILE_FLAGS extends js.Object
  
  @js.native
  sealed trait PREFERENCE extends js.Object
  
  @js.native
  sealed trait TREE_FLAG extends js.Object
  
  @js.native
  object ANALYSIS extends js.Object {
    @js.native
    sealed trait FASTFORWARD
      extends nodegitLib.mergeMod.MergeNs.ANALYSIS
    
    @js.native
    sealed trait NONE
      extends nodegitLib.mergeMod.MergeNs.ANALYSIS
    
    @js.native
    sealed trait NORMAL
      extends nodegitLib.mergeMod.MergeNs.ANALYSIS
    
    @js.native
    sealed trait UNBORN
      extends nodegitLib.mergeMod.MergeNs.ANALYSIS
    
    @js.native
    sealed trait UP_TO_DATE
      extends nodegitLib.mergeMod.MergeNs.ANALYSIS
    
    /* 4 */ val FASTFORWARD: FASTFORWARD with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
    /* 8 */ val UNBORN: UNBORN with scala.Double = js.native
    /* 2 */ val UP_TO_DATE: UP_TO_DATE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.ANALYSIS with scala.Double] = js.native
  }
  
  @js.native
  object FILE_FAVOR extends js.Object {
    @js.native
    sealed trait NORMAL
      extends nodegitLib.mergeMod.MergeNs.FILE_FAVOR
    
    @js.native
    sealed trait OURS
      extends nodegitLib.mergeMod.MergeNs.FILE_FAVOR
    
    @js.native
    sealed trait THEIRS
      extends nodegitLib.mergeMod.MergeNs.FILE_FAVOR
    
    @js.native
    sealed trait UNION
      extends nodegitLib.mergeMod.MergeNs.FILE_FAVOR
    
    /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
    /* 1 */ val OURS: OURS with scala.Double = js.native
    /* 2 */ val THEIRS: THEIRS with scala.Double = js.native
    /* 3 */ val UNION: UNION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.FILE_FAVOR with scala.Double] = js.native
  }
  
  @js.native
  object FILE_FLAGS extends js.Object {
    @js.native
    sealed trait FILE_DEFAULT
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_DIFF_MINIMAL
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_DIFF_PATIENCE
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_IGNORE_WHITESPACE
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_IGNORE_WHITESPACE_CHANGE
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_IGNORE_WHITESPACE_EOL
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_SIMPLIFY_ALNUM
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_STYLE_DIFF3
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    @js.native
    sealed trait FILE_STYLE_MERGE
      extends nodegitLib.mergeMod.MergeNs.FILE_FLAGS
    
    /* 0 */ val FILE_DEFAULT: FILE_DEFAULT with scala.Double = js.native
    /* 128 */ val FILE_DIFF_MINIMAL: FILE_DIFF_MINIMAL with scala.Double = js.native
    /* 64 */ val FILE_DIFF_PATIENCE: FILE_DIFF_PATIENCE with scala.Double = js.native
    /* 8 */ val FILE_IGNORE_WHITESPACE: FILE_IGNORE_WHITESPACE with scala.Double = js.native
    /* 16 */ val FILE_IGNORE_WHITESPACE_CHANGE: FILE_IGNORE_WHITESPACE_CHANGE with scala.Double = js.native
    /* 32 */ val FILE_IGNORE_WHITESPACE_EOL: FILE_IGNORE_WHITESPACE_EOL with scala.Double = js.native
    /* 4 */ val FILE_SIMPLIFY_ALNUM: FILE_SIMPLIFY_ALNUM with scala.Double = js.native
    /* 2 */ val FILE_STYLE_DIFF3: FILE_STYLE_DIFF3 with scala.Double = js.native
    /* 1 */ val FILE_STYLE_MERGE: FILE_STYLE_MERGE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.FILE_FLAGS with scala.Double] = js.native
  }
  
  @js.native
  object PREFERENCE extends js.Object {
    @js.native
    sealed trait FASTFORWARD_ONLY
      extends nodegitLib.mergeMod.MergeNs.PREFERENCE
    
    @js.native
    sealed trait NONE
      extends nodegitLib.mergeMod.MergeNs.PREFERENCE
    
    @js.native
    sealed trait NO_FASTFORWARD
      extends nodegitLib.mergeMod.MergeNs.PREFERENCE
    
    /* 2 */ val FASTFORWARD_ONLY: FASTFORWARD_ONLY with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 1 */ val NO_FASTFORWARD: NO_FASTFORWARD with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.PREFERENCE with scala.Double] = js.native
  }
  
  @js.native
  object TREE_FLAG extends js.Object {
    @js.native
    sealed trait TREE_FIND_RENAMES
      extends nodegitLib.mergeMod.MergeNs.TREE_FLAG
    
    /* 1 */ val TREE_FIND_RENAMES: TREE_FIND_RENAMES with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.TREE_FLAG with scala.Double] = js.native
  }
  
}

