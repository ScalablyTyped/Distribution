package typings.pouchdbMapreduce.PouchDB.Query

import typings.pouchdbMapreduce.PouchDB.BuiltInReducers
import typings.pouchdbMapreduce.PouchDB.Reducer
import typings.pouchdbMapreduce.pouchdbMapreduceStrings.ok
import typings.pouchdbMapreduce.pouchdbMapreduceStrings.update_after
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Content /* <: js.Object */, Reduction] extends js.Object {
  
  /** Include attachment data. */
  var attachments: js.UndefOr[Boolean] = js.native
  
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** Include conflicts in the _conflicts field of a doc. */
  var conflicts: js.UndefOr[Boolean] = js.native
  
  /** Reverse the order of the output rows. */
  var descending: js.UndefOr[Boolean] = js.native
  
  /** Get rows with keys in a certain range (inclusive/inclusive). */
  var endkey: js.UndefOr[js.Any] = js.native
  
  /** True if you want the reduce function to group results by keys, rather than returning a single result. */
  var group: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of elements in a key to group by, assuming the keys are arrays.
    * Defaults to the full length of the array.
    */
  var group_level: js.UndefOr[Double] = js.native
  
  /** Include the document in each row in the doc field. */
  var include_docs: js.UndefOr[Boolean] = js.native
  
  /** Include rows having a key equal to the given options.endkey. */
  var inclusive_end: js.UndefOr[Boolean] = js.native
  
  /** Only return rows matching this key. */
  var key: js.UndefOr[js.Any] = js.native
  
  /** Array of keys to fetch in a single shot. */
  var keys: js.UndefOr[js.Array[_]] = js.native
  
  /** Maximum number of rows to return. */
  var limit: js.UndefOr[Double] = js.native
  
  /** Reduce function, or the string name of a built-in function: '_sum', '_count', or '_stats'. */
  var reduce: js.UndefOr[(Reducer[Content, Reduction]) | BuiltInReducers | Boolean] = js.native
  
  /** Number of rows to skip before returning (warning: poor performance on IndexedDB/LevelDB!). */
  var skip: js.UndefOr[Double] = js.native
  
  /**
    * unspecified (default): Returns the latest results, waiting for the view to build if necessary.
    * 'ok': Returns results immediately, even if they’re out-of-date.
    * 'update_after': Returns results immediately, but kicks off a build afterwards.
    */
  var stale: js.UndefOr[ok | update_after] = js.native
  
  /** Get rows with keys in a certain range (inclusive/inclusive). */
  var startkey: js.UndefOr[js.Any] = js.native
}
object Options {
  
  @scala.inline
  def apply[Content /* <: js.Object */, Reduction](): Options[Content, Reduction] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Content, Reduction]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], Content /* <: js.Object */, Reduction] (val x: Self with (Options[Content, Reduction])) extends AnyVal {
    
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
    def setAttachments(value: Boolean): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setConflicts(value: Boolean): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    
    @scala.inline
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    
    @scala.inline
    def setEndkey(value: js.Any): Self = this.set("endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndkey: Self = this.set("endkey", js.undefined)
    
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroup_level(value: Double): Self = this.set("group_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup_level: Self = this.set("group_level", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    
    @scala.inline
    def setInclusive_end(value: Boolean): Self = this.set("inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusive_end: Self = this.set("inclusive_end", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setReduceFunction3(
      value: (/* keys */ js.Any | Null, /* values */ js.Array[Content | Reduction], /* rereduce */ Boolean) => js.Array[Reduction] | Reduction
    ): Self = this.set("reduce", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduce(value: (Reducer[Content, Reduction]) | BuiltInReducers | Boolean): Self = this.set("reduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setStale(value: ok | update_after): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setStartkey(value: js.Any): Self = this.set("startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartkey: Self = this.set("startkey", js.undefined)
  }
}
