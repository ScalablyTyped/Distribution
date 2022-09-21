package typings.n3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.n3.mod.^
import typings.n3.n3Strings.DollarLeftcurlybracketBaseFormatVariantRightcurlybracketDollarLeftcurlybracketStarRightcurlybracket
import typings.n3.n3Strings.DollarLeftcurlybracketMimeTypeRightcurlybracketSlashDollarLeftcurlybracketMimeSubtypeRightcurlybracket
import typings.std.Lowercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def termFromId(
  id: String,
  factory: typings.rdfjsTypes.dataModelMod.DataFactory[typings.rdfjsTypes.dataModelMod.Quad, typings.rdfjsTypes.dataModelMod.Quad]
): Term = (^.asInstanceOf[js.Dynamic].applyDynamic("termFromId")(id.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Term]

inline def termToId(term: Term): String = ^.asInstanceOf[js.Dynamic].applyDynamic("termToId")(term.asInstanceOf[js.Any]).asInstanceOf[String]

type BaseFormatVariant = BaseFormat | Lowercase[BaseFormat]

type ErrorCallback = js.Function2[/* err */ js.Error, /* result */ Any, Unit]

type MimeFormat = MimeSubtype | DollarLeftcurlybracketMimeTypeRightcurlybracketSlashDollarLeftcurlybracketMimeSubtypeRightcurlybracket

type MimeSubtype = BaseFormatVariant | DollarLeftcurlybracketBaseFormatVariantRightcurlybracketDollarLeftcurlybracketStarRightcurlybracket

type OTerm = typings.rdfjsTypes.dataModelMod.Term | String | Null

type ParseCallback[Q /* <: BaseQuad */] = js.Function3[
/* error */ js.Error, 
/* quad */ Q, 
/* prefixes */ Prefixes[typings.rdfjsTypes.dataModelMod.NamedNode[String]], 
Unit]

type PrefixCallback = js.Function2[
/* prefix */ String, 
/* prefixNode */ typings.rdfjsTypes.dataModelMod.NamedNode[String], 
Unit]

type PrefixedToIri = js.Function1[/* suffix */ String, NamedNode[String]]

type Prefixes[I] = StringDictionary[I]

type QuadCallback[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.n3.mod.DefaultGraph
  - typings.n3.mod.NamedNode[java.lang.String]
  - typings.n3.mod.BlankNode
  - typings.n3.mod.Variable
*/
type QuadGraph = _QuadGraph | NamedNode[String]

/* Rewritten from type alias, can be one of: 
  - typings.n3.mod.NamedNode[java.lang.String]
  - typings.n3.mod.Literal
  - typings.n3.mod.BlankNode
  - typings.n3.mod.Variable
*/
type QuadObject = _QuadObject | NamedNode[String]

type QuadPredicate[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Boolean]

/* Rewritten from type alias, can be one of: 
  - typings.n3.mod.NamedNode[java.lang.String]
  - typings.n3.mod.BlankNode
  - typings.n3.mod.Variable
*/
type QuadSubject = _QuadSubject | NamedNode[String]

type Quad_Predicate = NamedNode[String] | Variable

/* Rewritten from type alias, can be one of: 
  - typings.n3.mod.NamedNode[java.lang.String]
  - typings.n3.mod.BlankNode
  - typings.n3.mod.Literal
  - typings.n3.mod.Variable
  - typings.n3.mod.DefaultGraph
*/
type Term = _Term | NamedNode[String]

type TokenCallback = js.Function2[/* error */ js.Error, /* token */ Token, Unit]
