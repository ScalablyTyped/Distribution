package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.DONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefViewDefFieldMod {
  
  inline def apply(name: String, `type`: String, size: Double, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(name: String, `type`: String, size: Null, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/ViewDefField", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ViewDefField {
    def this(name: String, `type`: String, size: Double, args: Any*) = this()
    def this(name: String, `type`: String, size: Null, args: Any*) = this()
  }
  @JSImport("@nginstack/web-framework/lib/classdef/ViewDefField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/classdef/ViewDefField", "VM_LIST")
  @js.native
  def VM_LIST: Double = js.native
  inline def VM_LIST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VM_LIST")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/web-framework/lib/classdef/ViewDefField", "VM_THUMBNAIL")
  @js.native
  def VM_THUMBNAIL: Double = js.native
  inline def VM_THUMBNAIL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VM_THUMBNAIL")(x.asInstanceOf[js.Any])
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  type FieldAggregator = typings.nginstackWebFramework.libFieldAggregatorFieldAggregatorMod.^
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  type Link = typings.nginstackWebFramework.libAnchorLinkMod.^
  
  type ViewDef = typings.nginstackWebFramework.libClassdefViewDefMod.^
  
  @js.native
  trait ViewDefField extends StObject {
    
    /* private */ var _createEvent: Any = js.native
    
    /* private */ var _getClassDef: Any = js.native
    
    /* private */ var _index: Any = js.native
    
    /* private */ var _originalAssignTo: Any = js.native
    
    /* private */ var _ownControlledProperties: Any = js.native
    
    /* private */ var _propertiesToAssign: Any = js.native
    
    var aggregate: FieldAggregator = js.native
    
    var alignment: String = js.native
    
    var allowMultipleInsert: Boolean = js.native
    
    /* private */ var arRequiredDataSetFields: Any = js.native
    
    def assignTo(field: Any, args: Any*): Unit = js.native
    
    var breakLine: Boolean = js.native
    
    def canHaveGlobalActions(): Boolean = js.native
    
    /* private */ var canLocate: Any = js.native
    
    /* protected */ def changeFieldType_(`type`: Any, fieldName: Any, args: Any*): Unit = js.native
    
    /* private */ var changeable: Any = js.native
    
    var changed: Boolean = js.native
    
    /* private */ var classDef: Any = js.native
    
    var column: Double = js.native
    
    var controlType: String = js.native
    
    /* private */ var controlType_ : Any = js.native
    
    var cssClass: String = js.native
    
    /* private */ var defaultAdapterDescriptor_ : Any = js.native
    
    var detailDescendingIndexFieldNames: String = js.native
    
    var detailIndexFieldNames: String = js.native
    
    var duplicateMode: String = js.native
    
    var duplicationHandling: Any = js.native
    
    var editable: Boolean = js.native
    
    var emptyResultMessage: String = js.native
    
    var enterKeyAction: DONE | String = js.native
    
    var formViewable: Boolean = js.native
    
    def getGlobalActionClassKey(): Double = js.native
    def getGlobalActionClassKey(opt_key: Double): Double = js.native
    
    def getGlobalActionRegisterKey(): Double | Null = js.native
    def getGlobalActionRegisterKey(opt_key: Double): Double | Null = js.native
    
    def getIsDataBaseField(): Boolean = js.native
    
    /* private */ var getIsDataSetField: Any = js.native
    
    def hasEvent(eventName: String): Boolean = js.native
    
    var hasInformedControl: Boolean = js.native
    
    var hasLinks: Boolean = js.native
    
    def hasLookupDisplayEvent(): Boolean = js.native
    
    def hasVisibleThumbnail(): Boolean = js.native
    
    var height: Double = js.native
    
    /* private */ var inSetValue: Any = js.native
    
    /* private */ var inTableView: Any = js.native
    
    /* private */ var inheritedClassDefEvents_ : Any = js.native
    
    var isCalculated: Boolean = js.native
    
    def isGrid(): Boolean = js.native
    
    def isKey(): Boolean = js.native
    
    def isMasterDetail(): Boolean = js.native
    
    def isTree(): Boolean = js.native
    
    var labelCssClass: String = js.native
    
    var labelPosition: String = js.native
    
    /* private */ var lastMasterFieldValues: Any = js.native
    
    var link: Link = js.native
    
    var linkParametersValuesFieldNames: js.Array[Any] = js.native
    
    var links: typings.nginstackWebFramework.libAnchorAnchorCollectionMod.^ = js.native
    
    /* private */ var logger_ : Any = js.native
    
    var masterDetailMaxRecordCount: Double = js.native
    
    /* private */ var maxFiles: Any = js.native
    
    /* private */ var maxSize: Any = js.native
    
    var negativeInRed: Boolean = js.native
    
    /* private */ var nextEditableField: Any = js.native
    
    /* private */ var nextField: Any = js.native
    
    var onBlur: Event = js.native
    
    var onCalculate: Event = js.native
    
    var onDefineGrid: Event = js.native
    
    var onFocus: Event = js.native
    
    var onGetTreeIcon: Event = js.native
    
    var onLookupMultipleInsert: Event = js.native
    
    var onOpenKey: Event = js.native
    
    /* private */ var originalChangeFieldType_ : Any = js.native
    
    var parent: Grid | ViewDef = js.native
    
    /* private */ var priorEditableField: Any = js.native
    
    /* private */ var priorField: Any = js.native
    
    /* private */ var protectState_ : Any = js.native
    
    var readOnly: Boolean = js.native
    
    /* private */ var registerEvents_ : Any = js.native
    
    var requiredDataSetFields: String = js.native
    
    var resyncPending: Boolean = js.native
    
    var saveInputAsDefault: Boolean = js.native
    
    var showGlobalActions: Boolean = js.native
    
    /* private */ var superGetIsDataBaseField_ : Any = js.native
    
    /* private */ var superRegisterEvents_ : Any = js.native
    
    var tableViewHeight: Double | String | Null = js.native
    
    /* private */ var tableViewIndex: Any = js.native
    
    /* private */ var tableViewLabel: Any = js.native
    
    var tableViewWidth: Double = js.native
    
    var tableViewable: Boolean = js.native
    
    /* private */ var tableViewable_ : Any = js.native
    
    var thumbnail: typings.nginstackWebFramework.libClassdefCellThumbnailMod.^ = js.native
    
    /* private */ var totalContent: Any = js.native
    
    var treeChildFieldName: String = js.native
    
    var treeParentFieldName: String = js.native
    
    var treeRootValues: Any = js.native
    
    /* private */ var typesThatNotSupportUnderscoreAtName_ : Any = js.native
    
    /* private */ var unprotectState_ : Any = js.native
    
    /* private */ var unrestrictedOn_ : Any = js.native
    
    var viewMode: Double = js.native
    
    var visible: Boolean = js.native
    
    var width: Double = js.native
    
    var wrap: Boolean = js.native
    
    var zoomMaxHeight: Double | String | Null = js.native
    
    var zoomMaxWidth: Double | String | Null = js.native
  }
}
