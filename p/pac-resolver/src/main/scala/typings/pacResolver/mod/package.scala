package typings.pacResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FindProxyForURL = typings.std.ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createPacResolver */ js.Any
  ]
  
  type FindProxyForURLCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* result */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type GMT = typings.pacResolver.pacResolverStrings.GMT
  
  type PacResolverOptions = typings.degenerator.mod.CompileOptions
}
