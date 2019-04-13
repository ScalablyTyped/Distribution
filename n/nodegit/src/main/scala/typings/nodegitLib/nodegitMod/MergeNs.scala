package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Merge")
@js.native
object MergeNs extends js.Object {
  @js.native
  object ANALYSIS extends js.Object {
    /* 4 */ val FASTFORWARD: nodegitLib.mergeMod.MergeNs.ANALYSIS.FASTFORWARD with scala.Double = js.native
    /* 0 */ val NONE: nodegitLib.mergeMod.MergeNs.ANALYSIS.NONE with scala.Double = js.native
    /* 1 */ val NORMAL: nodegitLib.mergeMod.MergeNs.ANALYSIS.NORMAL with scala.Double = js.native
    /* 8 */ val UNBORN: nodegitLib.mergeMod.MergeNs.ANALYSIS.UNBORN with scala.Double = js.native
    /* 2 */ val UP_TO_DATE: nodegitLib.mergeMod.MergeNs.ANALYSIS.UP_TO_DATE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.ANALYSIS with scala.Double] = js.native
  }
  
  @js.native
  object FILE_FAVOR extends js.Object {
    /* 0 */ val NORMAL: nodegitLib.mergeMod.MergeNs.FILE_FAVOR.NORMAL with scala.Double = js.native
    /* 1 */ val OURS: nodegitLib.mergeMod.MergeNs.FILE_FAVOR.OURS with scala.Double = js.native
    /* 2 */ val THEIRS: nodegitLib.mergeMod.MergeNs.FILE_FAVOR.THEIRS with scala.Double = js.native
    /* 3 */ val UNION: nodegitLib.mergeMod.MergeNs.FILE_FAVOR.UNION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.FILE_FAVOR with scala.Double] = js.native
  }
  
  @js.native
  object FILE_FLAGS extends js.Object {
    /* 0 */ val FILE_DEFAULT: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_DEFAULT with scala.Double = js.native
    /* 128 */ val FILE_DIFF_MINIMAL: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_DIFF_MINIMAL with scala.Double = js.native
    /* 64 */ val FILE_DIFF_PATIENCE: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_DIFF_PATIENCE with scala.Double = js.native
    /* 8 */ val FILE_IGNORE_WHITESPACE: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_IGNORE_WHITESPACE with scala.Double = js.native
    /* 16 */ val FILE_IGNORE_WHITESPACE_CHANGE: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_IGNORE_WHITESPACE_CHANGE with scala.Double = js.native
    /* 32 */ val FILE_IGNORE_WHITESPACE_EOL: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_IGNORE_WHITESPACE_EOL with scala.Double = js.native
    /* 4 */ val FILE_SIMPLIFY_ALNUM: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_SIMPLIFY_ALNUM with scala.Double = js.native
    /* 2 */ val FILE_STYLE_DIFF3: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_STYLE_DIFF3 with scala.Double = js.native
    /* 1 */ val FILE_STYLE_MERGE: nodegitLib.mergeMod.MergeNs.FILE_FLAGS.FILE_STYLE_MERGE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.FILE_FLAGS with scala.Double] = js.native
  }
  
  @js.native
  object PREFERENCE extends js.Object {
    /* 2 */ val FASTFORWARD_ONLY: nodegitLib.mergeMod.MergeNs.PREFERENCE.FASTFORWARD_ONLY with scala.Double = js.native
    /* 0 */ val NONE: nodegitLib.mergeMod.MergeNs.PREFERENCE.NONE with scala.Double = js.native
    /* 1 */ val NO_FASTFORWARD: nodegitLib.mergeMod.MergeNs.PREFERENCE.NO_FASTFORWARD with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.PREFERENCE with scala.Double] = js.native
  }
  
  @js.native
  object TREE_FLAG extends js.Object {
    /* 1 */ val TREE_FIND_RENAMES: nodegitLib.mergeMod.MergeNs.TREE_FLAG.TREE_FIND_RENAMES with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.mergeMod.MergeNs.TREE_FLAG with scala.Double] = js.native
  }
  
}

