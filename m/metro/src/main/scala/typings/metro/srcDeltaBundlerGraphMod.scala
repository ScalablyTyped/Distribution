package typings.metro

import typings.metro.srcDeltaBundlerTypesMod.Dependencies
import typings.metro.srcDeltaBundlerTypesMod.GraphInputOptions
import typings.metro.srcDeltaBundlerTypesMod.Module
import typings.metro.srcDeltaBundlerTypesMod.Options
import typings.metro.srcDeltaBundlerTypesMod.TransformInputOptions
import typings.std.Map
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeltaBundlerGraphMod {
  
  @JSImport("metro/src/DeltaBundler/Graph", "Graph")
  @js.native
  open class Graph[T] protected () extends StObject {
    def this(options: GraphInputOptions) = this()
    
    var dependencies: Dependencies[T] = js.native
    
    var entryPoints: ReadonlySet[String] = js.native
    
    def initialTraverseDependencies(options: Options[T]): js.Promise[Result[T]] = js.native
    
    def markModifiedContextModules(filePath: String, modifiedPaths: Set[String]): Unit = js.native
    
    var transformOptions: TransformInputOptions = js.native
    
    def traverseDependencies(paths: js.Array[String], options: Options[T]): js.Promise[Result[T]] = js.native
  }
  
  trait Result[T] extends StObject {
    
    var added: Map[String, Module[T]]
    
    var deleted: Set[String]
    
    var modified: Map[String, Module[T]]
  }
  object Result {
    
    inline def apply[T](added: Map[String, Module[T]], deleted: Set[String], modified: Map[String, Module[T]]): Result[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result[?], T] (val x: Self & Result[T]) extends AnyVal {
      
      inline def setAdded(value: Map[String, Module[T]]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setDeleted(value: Set[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setModified(value: Map[String, Module[T]]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
}
