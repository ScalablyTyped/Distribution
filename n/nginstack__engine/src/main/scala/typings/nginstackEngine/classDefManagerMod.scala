package typings.nginstackEngine

import typings.nginstackEngine.anon.Classes
import typings.nginstackEngine.anon.ForceStrictMode
import typings.nginstackEngine.anon.IgnoredFileKeys
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classDefManagerMod {
  
  inline def apply(opt_options: Unit, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(opt_options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def apply(opt_options: Classes, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(opt_options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def apply(opt_options: Record[Any, Any], args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(opt_options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDefManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ClassDefManager {
    def this(opt_options: Unit, args: Any*) = this()
    def this(opt_options: Classes, args: Any*) = this()
    def this(opt_options: Record[Any, Any], args: Any*) = this()
  }
  @JSImport("@nginstack/engine/lib/classdef/ClassDefManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClassVersion(classKey: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassVersion")(classKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getClassVersion(classKey: typings.nginstackEngine.dbkeyMod.^): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassVersion")(classKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getInstance(): ClassDefManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[ClassDefManager]
  
  inline def getParentClass(classKey: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentClass")(classKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getParentClass(classKey: typings.nginstackEngine.dbkeyMod.^): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentClass")(classKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDefManager", "protectedFieldEvents")
  @js.native
  val protectedFieldEvents: js.Array[String] = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDefManager", "protectedFieldProperties")
  @js.native
  val protectedFieldProperties: js.Array[String] = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDefManager", "protectedModelDefEvents")
  @js.native
  val protectedModelDefEvents: js.Array[String] = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDefManager", "protectedModelDefProperties")
  @js.native
  val protectedModelDefProperties: js.Array[String] = js.native
  
  @js.native
  trait ClassDefManager extends StObject {
    
    var classes: Any = js.native
    
    def clearCache(): Unit = js.native
    
    /* private */ var configStrictEvaluator_ : Any = js.native
    
    /* private */ var createDef_ : Any = js.native
    
    /* private */ var formatCacheId_ : Any = js.native
    
    def getClassDef(classKey: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    def getClassDef(classKey: Double, opt_ignoredClassKeys: js.Array[Double]): typings.nginstackEngine.modelDefMod.^ = js.native
    
    var getClassDefBySource: Any = js.native
    
    def getClassDefVersion(classKey: Double): Double = js.native
    
    def getConfig(classKey: Double): typings.nginstackEngine.configDefMod.^ = js.native
    def getConfig(classKey: Double, opt_options: IgnoredFileKeys): typings.nginstackEngine.configDefMod.^ = js.native
    def getConfig(classKey: Double, opt_options: Record[Any, Any]): typings.nginstackEngine.configDefMod.^ = js.native
    
    def getConfigDefBySource(src: String, parent: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    
    /* private */ var getDefBySource_ : Any = js.native
    
    def getDefVersion(classKey: Double, sourceType: String): Double = js.native
    
    /* private */ var getDef_ : Any = js.native
    
    def getHierarchicalClasses(classKey: Double): js.Array[Double] = js.native
    
    def getModelDef(classKey: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    def getModelDef(classKey: Double, opt_options: ForceStrictMode): typings.nginstackEngine.modelDefMod.^ = js.native
    def getModelDef(classKey: Double, opt_options: Record[Any, Any]): typings.nginstackEngine.modelDefMod.^ = js.native
    
    def getModelDefBySource(src: String, parent: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    def getModelDefBySource(src: String, parent: Double, opt_classKey: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    
    def getViewDef(classKey: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    def getViewDef(classKey: Double, opt_options: IgnoredFileKeys): typings.nginstackEngine.modelDefMod.^ = js.native
    def getViewDef(classKey: Double, opt_options: Record[Any, Any]): typings.nginstackEngine.modelDefMod.^ = js.native
    
    def getViewDefBySource(src: String, parent: Double): typings.nginstackEngine.modelDefMod.^ = js.native
    
    def hasOwnModelDef(classKey: Double): Boolean = js.native
    
    def hasOwnViewDef(classKey: Double): Boolean = js.native
    
    /* private */ var masterDetailFieldsToValidate_ : Any = js.native
    
    /* protected */ def runStartupScripts(): Unit = js.native
    
    /* private */ var strictEvaluator_ : Any = js.native
    
    var strictMode: Boolean = js.native
    
    /* private */ var updateChildrenCachedClassDef_ : Any = js.native
    
    /* private */ var validateFields_ : Any = js.native
    
    var vfs: Any = js.native
  }
}
