package typings.ngPackagr.anon

import typings.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLogicalProjectPath extends StObject {
  
  /**
    * Get the relative path between two `LogicalProjectPath`s.
    *
    * This will return a `PathSegment` which would be a valid module specifier to use in `from` when
    * importing from `to`.
    */
  def relativePathBetween(from: LogicalProjectPath, to: LogicalProjectPath): PathSegment
}
object TypeofLogicalProjectPath {
  
  inline def apply(relativePathBetween: (LogicalProjectPath, LogicalProjectPath) => PathSegment): TypeofLogicalProjectPath = {
    val __obj = js.Dynamic.literal(relativePathBetween = js.Any.fromFunction2(relativePathBetween))
    __obj.asInstanceOf[TypeofLogicalProjectPath]
  }
  
  extension [Self <: TypeofLogicalProjectPath](x: Self) {
    
    inline def setRelativePathBetween(value: (LogicalProjectPath, LogicalProjectPath) => PathSegment): Self = StObject.set(x, "relativePathBetween", js.Any.fromFunction2(value))
  }
}
