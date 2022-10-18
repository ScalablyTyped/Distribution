package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridDetailGridMod {
  
  inline def apply(parent: Any, name: Any, master: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], name.asInstanceOf[js.Any], master.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/DetailGrid", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DetailGrid {
    def this(parent: Any, name: Any, master: Any) = this()
    
    /* private */ /* CompleteClass */
    var _masterScrollRequiresDataSet: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tryCreateDataSet: Any = js.native
    
    /* private */ /* CompleteClass */
    var adaptEvent_ : Any = js.native
    
    /* CompleteClass */
    var autoMasterPost: Boolean = js.native
    
    /* CompleteClass */
    var classKey: Any = js.native
    
    /* CompleteClass */
    override def config(): Unit = js.native
    
    /* CompleteClass */
    override def defaultMasterDetailAfterInsert(sender: Any): Unit = js.native
    
    /* CompleteClass */
    override def defaultMasterDetailBeforeInsert(sender: Any): Unit = js.native
    
    /* CompleteClass */
    override def defaultMasterDetailCreateDataSet(sender: Any): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def defaultMasterDetailDelete(sender: Any): Unit = js.native
    
    /* CompleteClass */
    override def defaultMasterDetailScroll(detailGrid: Any): Unit = js.native
    
    /* CompleteClass */
    override def del(handleDetailGrid: Any): Unit = js.native
    
    /* CompleteClass */
    var delete: Any = js.native
    
    /* CompleteClass */
    var ds: Any = js.native
    
    /* CompleteClass */
    override def edit(field: Any): Unit = js.native
    
    /* CompleteClass */
    var fDs: Any = js.native
    
    /* CompleteClass */
    override def insert(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var lastMasterBookmarkSynchronized: Any = js.native
    
    /* CompleteClass */
    var master: Any = js.native
    
    /* CompleteClass */
    var masterDeleteAction: Double = js.native
    
    /* CompleteClass */
    var maxRecordCount: Any = js.native
    
    /* CompleteClass */
    override def notifyCreateDataSet(): Unit = js.native
    
    /* CompleteClass */
    override def notifyMasterCancel(): Unit = js.native
    
    /* CompleteClass */
    override def notifyMasterDelete(): Unit = js.native
    
    /* CompleteClass */
    override def notifyMasterInsert(): Unit = js.native
    
    /* CompleteClass */
    override def notifyMasterPost(): Unit = js.native
    
    /* CompleteClass */
    override def notifyMasterScroll(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var notifyingMasterScroll_ : Any = js.native
    
    /* CompleteClass */
    var onCreateDataSet: Event = js.native
    
    /* CompleteClass */
    var onMasterCancel: Event = js.native
    
    /* CompleteClass */
    var onMasterDelete: Event = js.native
    
    /* CompleteClass */
    var onMasterInsert: Event = js.native
    
    /* CompleteClass */
    var onMasterPost: Event = js.native
    
    /* CompleteClass */
    var onMasterScroll: Event = js.native
    
    /* CompleteClass */
    override def post(autoMasterPost: Any, args: Any*): Unit = js.native
    
    /* private */ /* CompleteClass */
    var prepare: Any = js.native
    
    /* CompleteClass */
    var readOnly: Boolean = js.native
    
    /* protected */ /* CompleteClass */
    override def sync_(args: Any*): Unit = js.native
    
    /* CompleteClass */
    var title: Any = js.native
    
    /* private */ /* CompleteClass */
    @JSName("toString")
    var toString_FDetailGrid: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/DetailGrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DetailGrid extends StObject {
    
    /* private */ var _masterScrollRequiresDataSet: Any
    
    /* private */ var _tryCreateDataSet: Any
    
    /* private */ var adaptEvent_ : Any
    
    var autoMasterPost: Boolean
    
    var classKey: Any
    
    def config(): Unit
    
    def defaultMasterDetailAfterInsert(sender: Any): Unit
    
    def defaultMasterDetailBeforeInsert(sender: Any): Unit
    
    def defaultMasterDetailCreateDataSet(sender: Any): typings.nginstackEngine.libDatasetDataSetMod.^
    
    def defaultMasterDetailDelete(sender: Any): Unit
    
    def defaultMasterDetailScroll(detailGrid: Any): Unit
    
    def del(handleDetailGrid: Any): Unit
    
    var delete: Any
    
    var ds: Any
    
    def edit(field: Any): Unit
    
    var fDs: Any
    
    def insert(): Unit
    
    /* private */ var lastMasterBookmarkSynchronized: Any
    
    var master: Any
    
    var masterDeleteAction: Double
    
    var maxRecordCount: Any
    
    def notifyCreateDataSet(): Unit
    
    def notifyMasterCancel(): Unit
    
    def notifyMasterDelete(): Unit
    
    def notifyMasterInsert(): Unit
    
    def notifyMasterPost(): Unit
    
    def notifyMasterScroll(): Unit
    
    /* private */ var notifyingMasterScroll_ : Any
    
    var onCreateDataSet: Event
    
    var onMasterCancel: Event
    
    var onMasterDelete: Event
    
    var onMasterInsert: Event
    
    var onMasterPost: Event
    
    var onMasterScroll: Event
    
    def post(autoMasterPost: Any, args: Any*): Unit
    
    /* private */ var prepare: Any
    
    var readOnly: Boolean
    
    /* protected */ def sync_(args: Any*): Unit
    
    var title: Any
    
    /* private */ @JSName("toString")
    var toString_FDetailGrid: Any
  }
  object DetailGrid {
    
    inline def apply(
      _masterScrollRequiresDataSet: Any,
      _tryCreateDataSet: Any,
      adaptEvent_ : Any,
      autoMasterPost: Boolean,
      classKey: Any,
      config: () => Unit,
      defaultMasterDetailAfterInsert: Any => Unit,
      defaultMasterDetailBeforeInsert: Any => Unit,
      defaultMasterDetailCreateDataSet: Any => typings.nginstackEngine.libDatasetDataSetMod.^,
      defaultMasterDetailDelete: Any => Unit,
      defaultMasterDetailScroll: Any => Unit,
      del: Any => Unit,
      delete: Any,
      ds: Any,
      edit: Any => Unit,
      fDs: Any,
      insert: () => Unit,
      lastMasterBookmarkSynchronized: Any,
      master: Any,
      masterDeleteAction: Double,
      maxRecordCount: Any,
      notifyCreateDataSet: () => Unit,
      notifyMasterCancel: () => Unit,
      notifyMasterDelete: () => Unit,
      notifyMasterInsert: () => Unit,
      notifyMasterPost: () => Unit,
      notifyMasterScroll: () => Unit,
      notifyingMasterScroll_ : Any,
      onCreateDataSet: Event,
      onMasterCancel: Event,
      onMasterDelete: Event,
      onMasterInsert: Event,
      onMasterPost: Event,
      onMasterScroll: Event,
      post: (Any, /* repeated */ Any) => Unit,
      prepare: Any,
      readOnly: Boolean,
      sync_ : /* repeated */ Any => Unit,
      title: Any,
      toString_ : Any
    ): DetailGrid = {
      val __obj = js.Dynamic.literal(_masterScrollRequiresDataSet = _masterScrollRequiresDataSet.asInstanceOf[js.Any], _tryCreateDataSet = _tryCreateDataSet.asInstanceOf[js.Any], adaptEvent_ = adaptEvent_.asInstanceOf[js.Any], autoMasterPost = autoMasterPost.asInstanceOf[js.Any], classKey = classKey.asInstanceOf[js.Any], config = js.Any.fromFunction0(config), defaultMasterDetailAfterInsert = js.Any.fromFunction1(defaultMasterDetailAfterInsert), defaultMasterDetailBeforeInsert = js.Any.fromFunction1(defaultMasterDetailBeforeInsert), defaultMasterDetailCreateDataSet = js.Any.fromFunction1(defaultMasterDetailCreateDataSet), defaultMasterDetailDelete = js.Any.fromFunction1(defaultMasterDetailDelete), defaultMasterDetailScroll = js.Any.fromFunction1(defaultMasterDetailScroll), del = js.Any.fromFunction1(del), delete = delete.asInstanceOf[js.Any], ds = ds.asInstanceOf[js.Any], edit = js.Any.fromFunction1(edit), fDs = fDs.asInstanceOf[js.Any], insert = js.Any.fromFunction0(insert), lastMasterBookmarkSynchronized = lastMasterBookmarkSynchronized.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], masterDeleteAction = masterDeleteAction.asInstanceOf[js.Any], maxRecordCount = maxRecordCount.asInstanceOf[js.Any], notifyCreateDataSet = js.Any.fromFunction0(notifyCreateDataSet), notifyMasterCancel = js.Any.fromFunction0(notifyMasterCancel), notifyMasterDelete = js.Any.fromFunction0(notifyMasterDelete), notifyMasterInsert = js.Any.fromFunction0(notifyMasterInsert), notifyMasterPost = js.Any.fromFunction0(notifyMasterPost), notifyMasterScroll = js.Any.fromFunction0(notifyMasterScroll), notifyingMasterScroll_ = notifyingMasterScroll_.asInstanceOf[js.Any], onCreateDataSet = onCreateDataSet.asInstanceOf[js.Any], onMasterCancel = onMasterCancel.asInstanceOf[js.Any], onMasterDelete = onMasterDelete.asInstanceOf[js.Any], onMasterInsert = onMasterInsert.asInstanceOf[js.Any], onMasterPost = onMasterPost.asInstanceOf[js.Any], onMasterScroll = onMasterScroll.asInstanceOf[js.Any], post = js.Any.fromFunction2(post), prepare = prepare.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], sync_ = js.Any.fromFunction1(sync_), title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailGrid]
    }
    
    extension [Self <: DetailGrid](x: Self) {
      
      inline def setAdaptEvent_(value: Any): Self = StObject.set(x, "adaptEvent_", value.asInstanceOf[js.Any])
      
      inline def setAutoMasterPost(value: Boolean): Self = StObject.set(x, "autoMasterPost", value.asInstanceOf[js.Any])
      
      inline def setClassKey(value: Any): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: () => Unit): Self = StObject.set(x, "config", js.Any.fromFunction0(value))
      
      inline def setDefaultMasterDetailAfterInsert(value: Any => Unit): Self = StObject.set(x, "defaultMasterDetailAfterInsert", js.Any.fromFunction1(value))
      
      inline def setDefaultMasterDetailBeforeInsert(value: Any => Unit): Self = StObject.set(x, "defaultMasterDetailBeforeInsert", js.Any.fromFunction1(value))
      
      inline def setDefaultMasterDetailCreateDataSet(value: Any => typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "defaultMasterDetailCreateDataSet", js.Any.fromFunction1(value))
      
      inline def setDefaultMasterDetailDelete(value: Any => Unit): Self = StObject.set(x, "defaultMasterDetailDelete", js.Any.fromFunction1(value))
      
      inline def setDefaultMasterDetailScroll(value: Any => Unit): Self = StObject.set(x, "defaultMasterDetailScroll", js.Any.fromFunction1(value))
      
      inline def setDel(value: Any => Unit): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setDelete(value: Any): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDs(value: Any): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
      
      inline def setEdit(value: Any => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
      
      inline def setFDs(value: Any): Self = StObject.set(x, "fDs", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: () => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction0(value))
      
      inline def setLastMasterBookmarkSynchronized(value: Any): Self = StObject.set(x, "lastMasterBookmarkSynchronized", value.asInstanceOf[js.Any])
      
      inline def setMaster(value: Any): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setMasterDeleteAction(value: Double): Self = StObject.set(x, "masterDeleteAction", value.asInstanceOf[js.Any])
      
      inline def setMaxRecordCount(value: Any): Self = StObject.set(x, "maxRecordCount", value.asInstanceOf[js.Any])
      
      inline def setNotifyCreateDataSet(value: () => Unit): Self = StObject.set(x, "notifyCreateDataSet", js.Any.fromFunction0(value))
      
      inline def setNotifyMasterCancel(value: () => Unit): Self = StObject.set(x, "notifyMasterCancel", js.Any.fromFunction0(value))
      
      inline def setNotifyMasterDelete(value: () => Unit): Self = StObject.set(x, "notifyMasterDelete", js.Any.fromFunction0(value))
      
      inline def setNotifyMasterInsert(value: () => Unit): Self = StObject.set(x, "notifyMasterInsert", js.Any.fromFunction0(value))
      
      inline def setNotifyMasterPost(value: () => Unit): Self = StObject.set(x, "notifyMasterPost", js.Any.fromFunction0(value))
      
      inline def setNotifyMasterScroll(value: () => Unit): Self = StObject.set(x, "notifyMasterScroll", js.Any.fromFunction0(value))
      
      inline def setNotifyingMasterScroll_(value: Any): Self = StObject.set(x, "notifyingMasterScroll_", value.asInstanceOf[js.Any])
      
      inline def setOnCreateDataSet(value: Event): Self = StObject.set(x, "onCreateDataSet", value.asInstanceOf[js.Any])
      
      inline def setOnMasterCancel(value: Event): Self = StObject.set(x, "onMasterCancel", value.asInstanceOf[js.Any])
      
      inline def setOnMasterDelete(value: Event): Self = StObject.set(x, "onMasterDelete", value.asInstanceOf[js.Any])
      
      inline def setOnMasterInsert(value: Event): Self = StObject.set(x, "onMasterInsert", value.asInstanceOf[js.Any])
      
      inline def setOnMasterPost(value: Event): Self = StObject.set(x, "onMasterPost", value.asInstanceOf[js.Any])
      
      inline def setOnMasterScroll(value: Event): Self = StObject.set(x, "onMasterScroll", value.asInstanceOf[js.Any])
      
      inline def setPost(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      inline def setPrepare(value: Any): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setSync_(value: /* repeated */ Any => Unit): Self = StObject.set(x, "sync_", js.Any.fromFunction1(value))
      
      inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: Any): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def set_masterScrollRequiresDataSet(value: Any): Self = StObject.set(x, "_masterScrollRequiresDataSet", value.asInstanceOf[js.Any])
      
      inline def set_tryCreateDataSet(value: Any): Self = StObject.set(x, "_tryCreateDataSet", value.asInstanceOf[js.Any])
    }
  }
  
  type Event = typings.nginstackEngine.libEventEventMod.^
}
