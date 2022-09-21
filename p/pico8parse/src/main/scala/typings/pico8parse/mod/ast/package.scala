package typings.pico8parse.mod.ast

import typings.pico8parse.mod.ast.^
import typings.pico8parse.pico8parseStrings.BreakStatement
import typings.pico8parse.pico8parseStrings.Colon
import typings.pico8parse.pico8parseStrings.Dot
import typings.pico8parse.pico8parseStrings.DotDotDot
import typings.pico8parse.pico8parseStrings.`false`
import typings.pico8parse.pico8parseStrings.`true`
import typings.pico8parse.pico8parseStrings.and
import typings.pico8parse.pico8parseStrings.nil
import typings.pico8parse.pico8parseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def assignmentOperatorStatement(
  operator: BinaryOperator,
  variables: js.Array[Identifier_ | IndexExpression_ | MemberExpression_],
  init: js.Array[Expression]
): AssignmentOperatorStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentOperatorStatement")(operator.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AssignmentOperatorStatement_]

inline def assignmentStatement(
  variables: js.Array[Identifier_ | IndexExpression_ | MemberExpression_],
  init: js.Array[Expression]
): AssignmentStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentStatement")(variables.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AssignmentStatement_]

inline def binaryExpression(operator: and | or, left: Expression, right: Expression): LogicalExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[LogicalExpression]
inline def binaryExpression(operator: BinaryOperator, left: Expression, right: Expression): BinaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BinaryExpression_]
inline def binaryExpression(operator: ComparisonOperator, left: Expression, right: Expression): BinaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryExpression")(operator.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BinaryExpression_]

inline def breakStatement(): BreakStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("breakStatement")().asInstanceOf[BreakStatement_]

inline def callExpression(base: Expression, args: js.Array[Expression]): CallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpression")(base.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallExpression_]

inline def callStatement(expression: CallExpression_): CallStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("callStatement")(expression.asInstanceOf[js.Any]).asInstanceOf[CallStatement_]
inline def callStatement(expression: StringCallExpression_): CallStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("callStatement")(expression.asInstanceOf[js.Any]).asInstanceOf[CallStatement_]
inline def callStatement(expression: TableCallExpression_): CallStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("callStatement")(expression.asInstanceOf[js.Any]).asInstanceOf[CallStatement_]

inline def chunk(body: js.Array[Statement]): Chunk_ = ^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(body.asInstanceOf[js.Any]).asInstanceOf[Chunk_]

inline def comment(value: String, raw: String): Comment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Comment_]
inline def comment(value: String, raw: String, rawInterrupted: String): Comment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], rawInterrupted.asInstanceOf[js.Any])).asInstanceOf[Comment_]

inline def doStatement(body: js.Array[Statement]): DoStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("doStatement")(body.asInstanceOf[js.Any]).asInstanceOf[DoStatement_]

inline def elseClause(body: js.Array[Statement]): ElseClause_ = ^.asInstanceOf[js.Dynamic].applyDynamic("elseClause")(body.asInstanceOf[js.Any]).asInstanceOf[ElseClause_]

inline def elseifClause(condition: Expression, body: js.Array[Statement]): ElseifClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("elseifClause")(condition.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ElseifClause_]

inline def forGenericStatement(variables: js.Array[Identifier_], iterators: js.Array[Expression], body: js.Array[Statement]): ForGenericStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forGenericStatement")(variables.asInstanceOf[js.Any], iterators.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForGenericStatement_]

inline def forNumericStatement(variable: Identifier_, start: Expression, end: Expression, step: Null, body: js.Array[Statement]): ForNumericStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forNumericStatement")(variable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForNumericStatement_]
inline def forNumericStatement(
  variable: Identifier_,
  start: Expression,
  end: Expression,
  step: Expression,
  body: js.Array[Statement]
): ForNumericStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("forNumericStatement")(variable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[ForNumericStatement_]

inline def functionStatement(
  identifier: Null,
  parameters: js.Array[Identifier_ | VarargLiteral],
  isLocal: Boolean,
  body: js.Array[Statement]
): FunctionDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("functionStatement")(identifier.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration]
inline def functionStatement(
  identifier: Identifier_,
  parameters: js.Array[Identifier_ | VarargLiteral],
  isLocal: Boolean,
  body: js.Array[Statement]
): FunctionDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("functionStatement")(identifier.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration]
inline def functionStatement(
  identifier: MemberExpression_,
  parameters: js.Array[Identifier_ | VarargLiteral],
  isLocal: Boolean,
  body: js.Array[Statement]
): FunctionDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("functionStatement")(identifier.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[FunctionDeclaration]

inline def gotoStatement(label: Identifier_): GotoStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gotoStatement")(label.asInstanceOf[js.Any]).asInstanceOf[GotoStatement_]

inline def identifier(name: String): Identifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(name.asInstanceOf[js.Any]).asInstanceOf[Identifier_]

inline def ifClause(condition: Expression, body: js.Array[Statement]): IfClause_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifClause")(condition.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[IfClause_]

inline def ifStatement(clauses: IfStatementClauses): IfStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ifStatement")(clauses.asInstanceOf[js.Any]).asInstanceOf[IfStatement_]

inline def indexExpression(base: Expression, index: Expression): IndexExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("indexExpression")(base.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[IndexExpression_]

//#region node sketching
inline def labelStatement(label: Identifier_): LabelStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStatement")(label.asInstanceOf[js.Any]).asInstanceOf[LabelStatement_]

inline def literal(`type`: typings.pico8parse.mod.tokenTypes.BooleanLiteral, value: Boolean, raw: `true` | `false`): BooleanLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[BooleanLiteral]
inline def literal(`type`: typings.pico8parse.mod.tokenTypes.NumericLiteral, value: Double, raw: String): NumericLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[NumericLiteral]
inline def literal(`type`: typings.pico8parse.mod.tokenTypes.StringLiteral, value: String, raw: String): StringLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[StringLiteral]
inline def literal(
  `type`: typings.pico8parse.mod.tokenTypes.StringLiteral,
  value: String,
  raw: String,
  rawInterrupted: String
): StringLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], rawInterrupted.asInstanceOf[js.Any])).asInstanceOf[StringLiteral]
inline def literal(`type`: typings.pico8parse.mod.tokenTypes.VarargLiteral, value: DotDotDot, raw: DotDotDot): VarargLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[VarargLiteral]

inline def literal_nil(`type`: typings.pico8parse.mod.tokenTypes.NilLiteral, value: Null, raw: nil): NilLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[NilLiteral]

inline def localStatement(variables: js.Array[Identifier_], init: js.Array[Expression]): LocalStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("localStatement")(variables.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[LocalStatement_]

inline def memberExpression(base: Expression, indexer: Dot | Colon, identifier: Identifier_): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("memberExpression")(base.asInstanceOf[js.Any], indexer.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]

inline def repeatStatement(condition: Expression, body: js.Array[Statement]): RepeatStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatStatement")(condition.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RepeatStatement_]

inline def returnStatement(args: js.Array[Expression]): ReturnStatement_ = ^.asInstanceOf[js.Dynamic].applyDynamic("returnStatement")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnStatement_]

inline def stringCallExpression(base: Expression, argument: Expression): StringCallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("stringCallExpression")(base.asInstanceOf[js.Any], argument.asInstanceOf[js.Any])).asInstanceOf[StringCallExpression_]

inline def tableCallExpression(base: Expression, argument: js.Array[Expression]): TableCallExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tableCallExpression")(base.asInstanceOf[js.Any], argument.asInstanceOf[js.Any])).asInstanceOf[TableCallExpression_]

inline def tableConstructorExpression(fields: js.Array[TableKey_ | TableKeyString_ | TableValue_]): TableConstructorExpression_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tableConstructorExpression")(fields.asInstanceOf[js.Any]).asInstanceOf[TableConstructorExpression_]

inline def tableKey(key: Expression, value: Expression): TableKey_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tableKey")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TableKey_]

inline def tableKeyString(key: Identifier_, value: Expression): TableKeyString_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tableKeyString")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[TableKeyString_]

inline def tableValue(value: Expression): TableValue_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tableValue")(value.asInstanceOf[js.Any]).asInstanceOf[TableValue_]

inline def unaryExpression(operator: UnaryOperator, argument: Expression): UnaryExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("unaryExpression")(operator.asInstanceOf[js.Any], argument.asInstanceOf[js.Any])).asInstanceOf[UnaryExpression_]

inline def whileStatement(condition: Expression, body: js.Array[Statement]): WhileStatement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("whileStatement")(condition.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[WhileStatement_]

type BreakStatement_ = Base[BreakStatement]

type IfStatementClauses = Array[IfClause_ | ElseifClause_ | ElseClause_]

/* Rewritten from type alias, can be one of: 
  - typings.pico8parse.mod.ast.Statement
  - typings.pico8parse.mod.ast.Expression
  - typings.pico8parse.mod.ast.IfClause_
  - typings.pico8parse.mod.ast.ElseifClause_
  - typings.pico8parse.mod.ast.ElseClause_
  - typings.pico8parse.mod.ast.Chunk_
  - typings.pico8parse.mod.ast.TableKey_
  - typings.pico8parse.mod.ast.TableKeyString_
  - typings.pico8parse.mod.ast.TableValue_
  - typings.pico8parse.mod.ast.Comment_
*/
type Node = _Node | BreakStatement_

/* Rewritten from type alias, can be one of: 
  - typings.pico8parse.mod.ast.LabelStatement_
  - typings.pico8parse.mod.ast.BreakStatement_
  - typings.pico8parse.mod.ast.GotoStatement_
  - typings.pico8parse.mod.ast.ReturnStatement_
  - typings.pico8parse.mod.ast.IfStatement_
  - typings.pico8parse.mod.ast.WhileStatement_
  - typings.pico8parse.mod.ast.DoStatement_
  - typings.pico8parse.mod.ast.RepeatStatement_
  - typings.pico8parse.mod.ast.LocalStatement_
  - typings.pico8parse.mod.ast.AssignmentStatement_
  - typings.pico8parse.mod.ast.AssignmentOperatorStatement_
  - typings.pico8parse.mod.ast.CallStatement_
  - typings.pico8parse.mod.ast.FunctionDeclaration
  - typings.pico8parse.mod.ast.ForNumericStatement_
  - typings.pico8parse.mod.ast.ForGenericStatement_
*/
type Statement = _Statement | BreakStatement_
