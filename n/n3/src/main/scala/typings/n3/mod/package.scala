package typings.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorCallback = js.Function2[/* err */ typings.std.Error, /* result */ js.Any, scala.Unit]
  
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  
  type OTerm = typings.rdfJs.mod.Term | java.lang.String | scala.Null
  
  type ParseCallback[Q /* <: typings.n3.mod.BaseQuad */] = js.Function3[
    /* error */ typings.std.Error, 
    /* quad */ Q, 
    /* prefixes */ typings.n3.mod.Prefixes[typings.rdfJs.mod.NamedNode[java.lang.String]], 
    scala.Unit
  ]
  
  type PrefixedToIri = js.Function1[/* suffix */ java.lang.String, typings.n3.mod.NamedNode[java.lang.String]]
  
  type Prefixes[I] = org.scalablytyped.runtime.StringDictionary[I]
  
  type QuadCallback[Q /* <: typings.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.DefaultGraph
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Variable
  */
  type QuadGraph = typings.n3.mod._QuadGraph | typings.n3.mod.NamedNode[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.Literal
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Variable
  */
  type QuadObject = typings.n3.mod._QuadObject | typings.n3.mod.NamedNode[java.lang.String]
  
  type QuadPredicate[Q /* <: typings.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Variable
  */
  type QuadSubject = typings.n3.mod._QuadSubject | typings.n3.mod.NamedNode[java.lang.String]
  
  type Quad_Predicate = typings.n3.mod.NamedNode[java.lang.String] | typings.n3.mod.Variable
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Literal
    - typings.n3.mod.Variable
    - typings.n3.mod.DefaultGraph
  */
  type Term = typings.n3.mod._Term | typings.n3.mod.NamedNode[java.lang.String]
}
