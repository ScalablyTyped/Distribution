package typings.next

import typings.next.anon.EnsurePage
import typings.next.anon.MultiCompiler
import typings.next.distSharedLibConstantsMod.CompilerNameValues
import typings.next.nextInts.`0`
import typings.next.nextInts.`1`
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevOnDemandEntryHandlerMod {
  
  @JSImport("next/dist/server/dev/on-demand-entry-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/dev/on-demand-entry-handler", "ADDED")
  @js.native
  val ADDED: js.Symbol = js.native
  
  @JSImport("next/dist/server/dev/on-demand-entry-handler", "BUILDING")
  @js.native
  val BUILDING: js.Symbol = js.native
  
  @JSImport("next/dist/server/dev/on-demand-entry-handler", "BUILT")
  @js.native
  val BUILT: js.Symbol = js.native
  
  inline def getInvalidator(): Invalidator = ^.asInstanceOf[js.Dynamic].applyDynamic("getInvalidator")().asInstanceOf[Invalidator]
  
  inline def onDemandEntryHandler(hasMaxInactiveAgeMultiCompilerNextConfigPagesBufferLengthPagesDirRootDirAppDir: MultiCompiler): EnsurePage = ^.asInstanceOf[js.Dynamic].applyDynamic("onDemandEntryHandler")(hasMaxInactiveAgeMultiCompilerNextConfigPagesBufferLengthPagesDirRootDirAppDir.asInstanceOf[js.Any]).asInstanceOf[EnsurePage]
  
  trait ChildEntry
    extends StObject
       with EntryType {
    
    /**
      * Which parent entries use this childEntry.
      */
    var parentEntries: Set[String]
    
    var `type`: `1`
  }
  object ChildEntry {
    
    inline def apply(bundlePath: String, parentEntries: Set[String], request: String): ChildEntry = {
      val __obj = js.Dynamic.literal(bundlePath = bundlePath.asInstanceOf[js.Any], parentEntries = parentEntries.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[ChildEntry]
    }
    
    extension [Self <: ChildEntry](x: Self) {
      
      inline def setParentEntries(value: Set[String]): Self = StObject.set(x, "parentEntries", value.asInstanceOf[js.Any])
      
      inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entry
    extends StObject
       with EntryType {
    
    /**
      * The absolute page to the page file. Used for detecting if the file was removed. For example:
      * `/Users/Rick/project/pages/about/index.js`
      */
    var absolutePagePath: String
    
    /**
      * All parallel pages that match the same entry, for example:
      * ['/parallel/@bar/nested/@a/page', '/parallel/@bar/nested/@b/page', '/parallel/@foo/nested/@a/page', '/parallel/@foo/nested/@b/page']
      */
    var appPaths: js.Array[String] | Null
    
    var `type`: `0`
  }
  object Entry {
    
    inline def apply(absolutePagePath: String, bundlePath: String, request: String): Entry = {
      val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], bundlePath = bundlePath.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], appPaths = null)
      __obj.updateDynamic("type")(0)
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
      
      inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
      
      inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
      
      inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
      
      inline def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryType extends StObject {
    
    /**
      * Path to the page file relative to the dist folder with no extension.
      * For example: `pages/about/index`
      */
    var bundlePath: String
    
    /**
      * Tells if a page is scheduled to be disposed.
      */
    var dispose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Timestamp with the last time the page was active.
      */
    var lastActiveTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Webpack request to create a dependency for.
      */
    var request: String
    
    /**
      * Page build status.
      */
    var status: js.UndefOr[js.Symbol] = js.undefined
  }
  object EntryType {
    
    inline def apply(bundlePath: String, request: String): EntryType = {
      val __obj = js.Dynamic.literal(bundlePath = bundlePath.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryType]
    }
    
    extension [Self <: EntryType](x: Self) {
      
      inline def setBundlePath(value: String): Self = StObject.set(x, "bundlePath", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: Boolean): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setLastActiveTime(value: Double): Self = StObject.set(x, "lastActiveTime", value.asInstanceOf[js.Any])
      
      inline def setLastActiveTimeUndefined: Self = StObject.set(x, "lastActiveTime", js.undefined)
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: js.Symbol): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextInts.`0`
    - typings.next.nextInts.`1`
  */
  trait EntryTypes extends StObject
  object EntryTypes {
    
    inline def CHILD_ENTRY: `1` = 1.asInstanceOf[`1`]
    
    inline def ENTRY: `0` = 0.asInstanceOf[`0`]
  }
  
  @js.native
  trait Invalidator extends StObject {
    
    /* private */ var building: Any = js.native
    
    def doneBuilding(): Unit = js.native
    
    def invalidate(): Unit = js.native
    def invalidate(compilerKeys: js.Array[CompilerNameValues]): Unit = js.native
    
    /* private */ var multiCompiler: Any = js.native
    
    /* private */ var rebuildAgain: Any = js.native
    
    def shouldRebuildAll(): Boolean = js.native
    
    def startBuilding(
      compilerKey: /* keyof {[ compilerKey in next.next/dist/shared/lib/constants.CompilerNameValues ]: number} */ String
    ): Unit = js.native
  }
}
