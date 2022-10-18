package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorLinkMod {
  
  inline def apply(name: String, target: String, processKey: Double, newTab: Boolean, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(name: String, target: String, processKey: Double, newTab: Unit, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(name: String, target: String, processKey: Unit, newTab: Boolean, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(name: String, target: String, processKey: Unit, newTab: Unit, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(
    name: String,
    target: js.Function1[/* arg0 */ Any, Any],
    processKey: Double,
    newTab: Boolean,
    args: Any*
  ): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(
    name: String,
    target: js.Function1[/* arg0 */ Any, Any],
    processKey: Double,
    newTab: Unit,
    args: Any*
  ): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(
    name: String,
    target: js.Function1[/* arg0 */ Any, Any],
    processKey: Unit,
    newTab: Boolean,
    args: Any*
  ): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(
    name: String,
    target: js.Function1[/* arg0 */ Any, Any],
    processKey: Unit,
    newTab: Unit,
    args: Any*
  ): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], processKey.asInstanceOf[js.Any], newTab.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/anchor/Link", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Link {
    def this(name: String, target: String, processKey: Double, newTab: Boolean, args: Any*) = this()
    def this(name: String, target: String, processKey: Double, newTab: Unit, args: Any*) = this()
    def this(name: String, target: String, processKey: Unit, newTab: Boolean, args: Any*) = this()
    def this(name: String, target: String, processKey: Unit, newTab: Unit, args: Any*) = this()
    def this(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      processKey: Double,
      newTab: Boolean,
      args: Any*
    ) = this()
    def this(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      processKey: Double,
      newTab: Unit,
      args: Any*
    ) = this()
    def this(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      processKey: Unit,
      newTab: Boolean,
      args: Any*
    ) = this()
    def this(
      name: String,
      target: js.Function1[/* arg0 */ Any, Any],
      processKey: Unit,
      newTab: Unit,
      args: Any*
    ) = this()
    
    /* private */ /* CompleteClass */
    var _getArrayFromList: Any = js.native
    
    /* private */ /* CompleteClass */
    var _prepare: Any = js.native
    
    /* CompleteClass */
    var autoSanitize: Boolean = js.native
    
    /* CompleteClass */
    var changed: Boolean = js.native
    
    /* CompleteClass */
    var cssClass: String = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var getChanges: Any = js.native
    
    /* private */ /* CompleteClass */
    var getClientFunction_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getHtml: Any = js.native
    
    /* private */ /* CompleteClass */
    var getLinkFieldNamesParamsOp: Any = js.native
    
    /* private */ /* CompleteClass */
    var getProcessedParameters: Any = js.native
    
    /* CompleteClass */
    var paramsFieldNames: js.Array[Any] = js.native
    
    /* private */ /* CompleteClass */
    var paramsFieldNames_ : Any = js.native
    
    /* CompleteClass */
    override def prepare(): Unit = js.native
    
    /* protected */ /* CompleteClass */
    var propertiesToSync_ : js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    var setPropertiesDefaultValues: Any = js.native
    
    /* CompleteClass */
    var srcId: String = js.native
    
    /* private */ /* CompleteClass */
    @JSName("toString")
    var toString_FLink: Any = js.native
    
    /* CompleteClass */
    override def write(content: String, parametersValue: String, cssClass: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    var writeToClient: Any = js.native
    
    /* private */ /* CompleteClass */
    var written_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/anchor/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Link extends StObject {
    
    /* private */ var _getArrayFromList: Any
    
    /* private */ var _prepare: Any
    
    var autoSanitize: Boolean
    
    var changed: Boolean
    
    var cssClass: String
    
    var enabled: Boolean
    
    /* private */ var getChanges: Any
    
    /* private */ var getClientFunction_ : Any
    
    /* private */ var getHtml: Any
    
    /* private */ var getLinkFieldNamesParamsOp: Any
    
    /* private */ var getProcessedParameters: Any
    
    var paramsFieldNames: js.Array[Any]
    
    /* private */ var paramsFieldNames_ : Any
    
    def prepare(): Unit
    
    /* protected */ var propertiesToSync_ : js.Array[String]
    
    /* private */ var setPropertiesDefaultValues: Any
    
    var srcId: String
    
    /* private */ @JSName("toString")
    var toString_FLink: Any
    
    def write(content: String, parametersValue: String, cssClass: String): Unit
    
    /* private */ var writeToClient: Any
    
    /* private */ var written_ : Any
  }
  object Link {
    
    inline def apply(
      _getArrayFromList: Any,
      _prepare: Any,
      autoSanitize: Boolean,
      changed: Boolean,
      cssClass: String,
      enabled: Boolean,
      getChanges: Any,
      getClientFunction_ : Any,
      getHtml: Any,
      getLinkFieldNamesParamsOp: Any,
      getProcessedParameters: Any,
      paramsFieldNames: js.Array[Any],
      paramsFieldNames_ : Any,
      prepare: () => Unit,
      propertiesToSync_ : js.Array[String],
      setPropertiesDefaultValues: Any,
      srcId: String,
      toString_ : Any,
      write: (String, String, String) => Unit,
      writeToClient: Any,
      written_ : Any
    ): Link = {
      val __obj = js.Dynamic.literal(_getArrayFromList = _getArrayFromList.asInstanceOf[js.Any], _prepare = _prepare.asInstanceOf[js.Any], autoSanitize = autoSanitize.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], cssClass = cssClass.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getChanges = getChanges.asInstanceOf[js.Any], getClientFunction_ = getClientFunction_.asInstanceOf[js.Any], getHtml = getHtml.asInstanceOf[js.Any], getLinkFieldNamesParamsOp = getLinkFieldNamesParamsOp.asInstanceOf[js.Any], getProcessedParameters = getProcessedParameters.asInstanceOf[js.Any], paramsFieldNames = paramsFieldNames.asInstanceOf[js.Any], paramsFieldNames_ = paramsFieldNames_.asInstanceOf[js.Any], prepare = js.Any.fromFunction0(prepare), propertiesToSync_ = propertiesToSync_.asInstanceOf[js.Any], setPropertiesDefaultValues = setPropertiesDefaultValues.asInstanceOf[js.Any], srcId = srcId.asInstanceOf[js.Any], write = js.Any.fromFunction3(write), writeToClient = writeToClient.asInstanceOf[js.Any], written_ = written_.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setAutoSanitize(value: Boolean): Self = StObject.set(x, "autoSanitize", value.asInstanceOf[js.Any])
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setGetChanges(value: Any): Self = StObject.set(x, "getChanges", value.asInstanceOf[js.Any])
      
      inline def setGetClientFunction_(value: Any): Self = StObject.set(x, "getClientFunction_", value.asInstanceOf[js.Any])
      
      inline def setGetHtml(value: Any): Self = StObject.set(x, "getHtml", value.asInstanceOf[js.Any])
      
      inline def setGetLinkFieldNamesParamsOp(value: Any): Self = StObject.set(x, "getLinkFieldNamesParamsOp", value.asInstanceOf[js.Any])
      
      inline def setGetProcessedParameters(value: Any): Self = StObject.set(x, "getProcessedParameters", value.asInstanceOf[js.Any])
      
      inline def setParamsFieldNames(value: js.Array[Any]): Self = StObject.set(x, "paramsFieldNames", value.asInstanceOf[js.Any])
      
      inline def setParamsFieldNamesVarargs(value: Any*): Self = StObject.set(x, "paramsFieldNames", js.Array(value*))
      
      inline def setParamsFieldNames_(value: Any): Self = StObject.set(x, "paramsFieldNames_", value.asInstanceOf[js.Any])
      
      inline def setPrepare(value: () => Unit): Self = StObject.set(x, "prepare", js.Any.fromFunction0(value))
      
      inline def setPropertiesToSync_(value: js.Array[String]): Self = StObject.set(x, "propertiesToSync_", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToSync_Varargs(value: String*): Self = StObject.set(x, "propertiesToSync_", js.Array(value*))
      
      inline def setSetPropertiesDefaultValues(value: Any): Self = StObject.set(x, "setPropertiesDefaultValues", value.asInstanceOf[js.Any])
      
      inline def setSrcId(value: String): Self = StObject.set(x, "srcId", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: Any): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: (String, String, String) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
      
      inline def setWriteToClient(value: Any): Self = StObject.set(x, "writeToClient", value.asInstanceOf[js.Any])
      
      inline def setWritten_(value: Any): Self = StObject.set(x, "written_", value.asInstanceOf[js.Any])
      
      inline def set_getArrayFromList(value: Any): Self = StObject.set(x, "_getArrayFromList", value.asInstanceOf[js.Any])
      
      inline def set_prepare(value: Any): Self = StObject.set(x, "_prepare", value.asInstanceOf[js.Any])
    }
  }
}
