package typings.pico8parse

import typings.pico8parse.anon.PartialOptions
import typings.pico8parse.anon.PartialOptionswaittrue
import typings.pico8parse.mod.LuaVersion
import typings.pico8parse.mod.Parser
import typings.pico8parse.mod.ast.AssignmentOperatorStatement_
import typings.pico8parse.mod.ast.AssignmentStatement_
import typings.pico8parse.mod.ast.BinaryExpression_
import typings.pico8parse.mod.ast.BinaryOperator
import typings.pico8parse.mod.ast.BreakStatement_
import typings.pico8parse.mod.ast.CallExpression_
import typings.pico8parse.mod.ast.CallStatement_
import typings.pico8parse.mod.ast.Chunk_
import typings.pico8parse.mod.ast.Comment_
import typings.pico8parse.mod.ast.ComparisonOperator
import typings.pico8parse.mod.ast.DoStatement_
import typings.pico8parse.mod.ast.ElseClause_
import typings.pico8parse.mod.ast.ElseifClause_
import typings.pico8parse.mod.ast.Expression
import typings.pico8parse.mod.ast.ForGenericStatement_
import typings.pico8parse.mod.ast.ForNumericStatement_
import typings.pico8parse.mod.ast.FunctionDeclaration
import typings.pico8parse.mod.ast.GotoStatement_
import typings.pico8parse.mod.ast.Identifier_
import typings.pico8parse.mod.ast.IfClause_
import typings.pico8parse.mod.ast.IfStatementClauses
import typings.pico8parse.mod.ast.IfStatement_
import typings.pico8parse.mod.ast.IndexExpression_
import typings.pico8parse.mod.ast.LabelStatement_
import typings.pico8parse.mod.ast.LocalStatement_
import typings.pico8parse.mod.ast.LogicalExpression
import typings.pico8parse.mod.ast.MemberExpression_
import typings.pico8parse.mod.ast.Node
import typings.pico8parse.mod.ast.RepeatStatement_
import typings.pico8parse.mod.ast.ReturnStatement_
import typings.pico8parse.mod.ast.Statement
import typings.pico8parse.mod.ast.StringCallExpression_
import typings.pico8parse.mod.ast.TableCallExpression_
import typings.pico8parse.mod.ast.TableConstructorExpression_
import typings.pico8parse.mod.ast.TableKeyString_
import typings.pico8parse.mod.ast.TableKey_
import typings.pico8parse.mod.ast.TableValue_
import typings.pico8parse.mod.ast.Token
import typings.pico8parse.mod.ast.UnaryExpression_
import typings.pico8parse.mod.ast.UnaryOperator
import typings.pico8parse.mod.ast.VarargLiteral
import typings.pico8parse.mod.ast.WhileStatement_
import typings.pico8parse.mod.tokenTypes.BooleanLiteral
import typings.pico8parse.mod.tokenTypes.NilLiteral
import typings.pico8parse.mod.tokenTypes.NumericLiteral
import typings.pico8parse.mod.tokenTypes.StringLiteral
import typings.pico8parse.pico8parseStrings.Colon
import typings.pico8parse.pico8parseStrings.Dot
import typings.pico8parse.pico8parseStrings.DotDotDot
import typings.pico8parse.pico8parseStrings.`false`
import typings.pico8parse.pico8parseStrings.`pseudo-latin1`
import typings.pico8parse.pico8parseStrings.`true`
import typings.pico8parse.pico8parseStrings.`x-user-defined`
import typings.pico8parse.pico8parseStrings.and
import typings.pico8parse.pico8parseStrings.nil
import typings.pico8parse.pico8parseStrings.none
import typings.pico8parse.pico8parseStrings.or
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pico8parse {
    
    @JSGlobal("pico8parse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("pico8parse.SyntaxError")
    @js.native
    open class SyntaxError ()
      extends typings.pico8parse.mod.SyntaxError
    
    object ast {
      
      @JSGlobal("pico8parse.ast")
      @js.native
      val ^ : js.Any = js.native
      
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
      
      inline def literal(`type`: BooleanLiteral, value: Boolean, raw: `true` | `false`): typings.pico8parse.mod.ast.BooleanLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[typings.pico8parse.mod.ast.BooleanLiteral]
      inline def literal(`type`: NumericLiteral, value: Double, raw: String): typings.pico8parse.mod.ast.NumericLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[typings.pico8parse.mod.ast.NumericLiteral]
      inline def literal(`type`: StringLiteral, value: String, raw: String): typings.pico8parse.mod.ast.StringLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[typings.pico8parse.mod.ast.StringLiteral]
      inline def literal(`type`: StringLiteral, value: String, raw: String, rawInterrupted: String): typings.pico8parse.mod.ast.StringLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], rawInterrupted.asInstanceOf[js.Any])).asInstanceOf[typings.pico8parse.mod.ast.StringLiteral]
      inline def literal(`type`: typings.pico8parse.mod.tokenTypes.VarargLiteral, value: DotDotDot, raw: DotDotDot): VarargLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[VarargLiteral]
      
      inline def literal_nil(`type`: NilLiteral, value: Null, raw: nil): typings.pico8parse.mod.ast.NilLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[typings.pico8parse.mod.ast.NilLiteral]
      
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
    }
    
    /* Inlined std.Partial<pico8parse.pico8parse.Options> */
    object defaultOptions {
      
      @JSGlobal("pico8parse.defaultOptions")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("pico8parse.defaultOptions.comments")
      @js.native
      def comments: js.UndefOr[Boolean] = js.native
      inline def comments_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comments")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.encodingMode")
      @js.native
      def encodingMode: js.UndefOr[`pseudo-latin1` | `x-user-defined` | none] = js.native
      inline def encodingMode_=(x: js.UndefOr[`pseudo-latin1` | `x-user-defined` | none]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodingMode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.extendedIdentifiers")
      @js.native
      def extendedIdentifiers: js.UndefOr[typings.pico8parse.pico8parseBooleans.`false`] = js.native
      inline def extendedIdentifiers_=(x: js.UndefOr[typings.pico8parse.pico8parseBooleans.`false`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedIdentifiers")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.ignoreStrictP8FileFormat")
      @js.native
      def ignoreStrictP8FileFormat: js.UndefOr[Boolean] = js.native
      inline def ignoreStrictP8FileFormat_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStrictP8FileFormat")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.locations")
      @js.native
      def locations: js.UndefOr[Boolean] = js.native
      inline def locations_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locations")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.luaVersion")
      @js.native
      def luaVersion: js.UndefOr[LuaVersion] = js.native
      inline def luaVersion_=(x: js.UndefOr[LuaVersion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("luaVersion")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.onCreateNode")
      @js.native
      def onCreateNode: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
      inline def onCreateNode_=(x: js.UndefOr[js.Function1[/* node */ Node, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreateNode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.onCreateScope")
      @js.native
      def onCreateScope: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onCreateScope_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreateScope")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.onDestroyScope")
      @js.native
      def onDestroyScope: js.UndefOr[js.Function0[Unit]] = js.native
      inline def onDestroyScope_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDestroyScope")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.onLocalDeclaration")
      @js.native
      def onLocalDeclaration: js.UndefOr[js.Function1[/* identifier */ Identifier_, Unit]] = js.native
      inline def onLocalDeclaration_=(x: js.UndefOr[js.Function1[/* identifier */ Identifier_, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLocalDeclaration")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.ranges")
      @js.native
      def ranges: js.UndefOr[Boolean] = js.native
      inline def ranges_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.scope")
      @js.native
      def scope: js.UndefOr[Boolean] = js.native
      inline def scope_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.defaultOptions.wait")
      @js.native
      def wait_ : js.UndefOr[Boolean] = js.native
      
      inline def wait__=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wait")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("pico8parse.end")
    @js.native
    val end: js.Function1[/* segment */ js.UndefOr[String], Chunk_] = js.native
    
    @JSGlobal("pico8parse.errors")
    @js.native
    val errors: Record[String, String] = js.native
    
    @JSGlobal("pico8parse.lex")
    @js.native
    val lex: js.Function0[Token] = js.native
    
    inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
    inline def parse(code: String): Chunk_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[Chunk_]
    inline def parse(code: String, options: PartialOptions): Chunk_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chunk_]
    inline def parse(code: String, options: PartialOptionswaittrue): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
    inline def parse(options: PartialOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
    
    @JSGlobal("pico8parse.tokenTypes")
    @js.native
    object tokenTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pico8parse.mod.tokenTypes & Double] = js.native
      
      /* 64 */ val BooleanLiteral: typings.pico8parse.mod.tokenTypes.BooleanLiteral & Double = js.native
      
      /* 1 */ val EOF: typings.pico8parse.mod.tokenTypes.EOF & Double = js.native
      
      /* 8 */ val Identifier: typings.pico8parse.mod.tokenTypes.Identifier & Double = js.native
      
      /* 4 */ val Keyword: typings.pico8parse.mod.tokenTypes.Keyword & Double = js.native
      
      /* 128 */ val NilLiteral: typings.pico8parse.mod.tokenTypes.NilLiteral & Double = js.native
      
      /* 16 */ val NumericLiteral: typings.pico8parse.mod.tokenTypes.NumericLiteral & Double = js.native
      
      /* 32 */ val Punctuator: typings.pico8parse.mod.tokenTypes.Punctuator & Double = js.native
      
      /* 2 */ val StringLiteral: typings.pico8parse.mod.tokenTypes.StringLiteral & Double = js.native
      
      /* 256 */ val VarargLiteral: typings.pico8parse.mod.tokenTypes.VarargLiteral & Double = js.native
    }
    
    @JSGlobal("pico8parse.version")
    @js.native
    val version: String = js.native
    
    /* Inlined std.Record<pico8parse.pico8parse.LuaVersion, boolean> */
    object versionFeatures {
      
      @JSGlobal("pico8parse.versionFeatures")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("pico8parse.versionFeatures.5.1")
      @js.native
      val `51`: Boolean = js.native
      
      @JSGlobal("pico8parse.versionFeatures.5.2")
      @js.native
      val `52`: Boolean = js.native
      
      @JSGlobal("pico8parse.versionFeatures.5.3")
      @js.native
      val `53`: Boolean = js.native
      
      @JSGlobal("pico8parse.versionFeatures.LuaJIT")
      @js.native
      def LuaJIT: Boolean = js.native
      inline def LuaJIT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LuaJIT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.versionFeatures.PICO-8")
      @js.native
      def PICO8: Boolean = js.native
      
      @JSGlobal("pico8parse.versionFeatures.PICO-8-0.2.1")
      @js.native
      def PICO8021: Boolean = js.native
      
      inline def PICO8021_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICO-8-0.2.1")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.versionFeatures.PICO-8-0.2.2")
      @js.native
      def PICO8022: Boolean = js.native
      
      inline def PICO8022_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICO-8-0.2.2")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.versionFeatures.PICO-8-0.2.3")
      @js.native
      def PICO8023: Boolean = js.native
      
      inline def PICO8023_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICO-8-0.2.3")(x.asInstanceOf[js.Any])
      
      @JSGlobal("pico8parse.versionFeatures.PICO-8-0.2.4")
      @js.native
      def PICO8024: Boolean = js.native
      
      inline def PICO8024_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICO-8-0.2.4")(x.asInstanceOf[js.Any])
      
      inline def PICO8_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PICO-8")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("pico8parse.write")
    @js.native
    val write: js.Function1[/* segment */ String, Parser] = js.native
  }
}
