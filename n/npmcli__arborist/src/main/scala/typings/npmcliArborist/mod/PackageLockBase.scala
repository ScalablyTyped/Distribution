package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.npmcliArborist.anon.Workspaces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _PackageLock * / any */ trait PackageLockBase extends StObject {
  
  var packages: js.UndefOr[
    StringDictionary[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LockDependency */ Any) & Workspaces
    ]
  ] = js.undefined
}
object PackageLockBase {
  
  inline def apply(): PackageLockBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageLockBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageLockBase] (val x: Self) extends AnyVal {
    
    inline def setPackages(
      value: StringDictionary[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LockDependency */ Any) & Workspaces
        ]
    ): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
  }
}
