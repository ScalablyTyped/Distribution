package typings.peberminta

import typings.peberminta.pebermintaBooleans.`false`
import typings.peberminta.pebermintaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peberminta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ab[TToken, TOptions, TValueA, TValueB, TValue](
    pa: Parser[TToken, TOptions, TValueA],
    pb: Parser[TToken, TOptions, TValueB],
    /**
    * @param va - A value matched by the first parser.
    * @param vb - A value matched by the second parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before both parsers matched).
    * @param j - Parser position in the tokens array (after both parsers matched).
    */
  join: js.Function5[
      /* va */ TValueA, 
      /* vb */ TValueB, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      TValue
    ]
  ): Parser[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("ab")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def abc[TToken, TOptions, TValueA, TValueB, TValueC, TValue](
    pa: Parser[TToken, TOptions, TValueA],
    pb: Parser[TToken, TOptions, TValueB],
    pc: Parser[TToken, TOptions, TValueC],
    /**
    * @param va - A value matched by the first parser.
    * @param vb - A value matched by the second parser.
    * @param vc - A value matched by the third parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before all three parsers matched).
    * @param j - Parser position in the tokens array (after all three parsers matched).
    */
  join: js.Function6[
      /* va */ TValueA, 
      /* vb */ TValueB, 
      /* vc */ TValueC, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      TValue
    ]
  ): Parser[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("abc")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any], pc.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def action[TToken, TOptions](
    /**
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array.
    */
  f: js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, Unit]
  ): Matcher[TToken, TOptions, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("action")(f.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, Null]]
  
  inline def ahead[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue]): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def ahead_TTokenTOptionsTValue_Matcher[TToken, TOptions, TValue](p: Matcher[TToken, TOptions, TValue]): Matcher[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("ahead")(p.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def all[TToken, TOptions, TValue](ps: (Parser[TToken, TOptions, TValue])*): Parser[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, js.Array[TValue]]]
  
  inline def and[TToken, TOptions, TValue](ps: (Parser[TToken, TOptions, TValue])*): Parser[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, js.Array[TValue]]]
  
  inline def any[TToken, TOptions](data: Data[TToken, TOptions], i: Double): Result[TToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Result[TToken]]
  
  inline def chain[TToken, TOptions, TValue1, TValue2](
    p: Parser[TToken, TOptions, TValue1],
    /**
    * @param v1 - A value from the first parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the first parser matched).
    * @param j - Parser position in the tokens array (after the first parser matched).
    */
  f: js.Function4[
      /* v1 */ TValue1, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      Parser[TToken, TOptions, TValue2]
    ]
  ): Parser[TToken, TOptions, TValue2] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue2]]
  
  inline def chainReduce[TToken, TOptions, TAcc](
    acc: TAcc,
    /**
    * @param acc - Accumulated value.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before each parser called).
    */
  f: js.Function3[
      /* acc */ TAcc, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      Parser[TToken, TOptions, TAcc]
    ]
  ): Matcher[TToken, TOptions, TAcc] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainReduce")(acc.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TAcc]]
  
  inline def choice[TToken, TOptions, TValue](ps: (Parser[TToken, TOptions, TValue])*): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def condition[TToken, TOptions, TValue](
    /**
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before parsing).
    */
  cond: js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, Boolean],
    pTrue: Parser[TToken, TOptions, TValue],
    pFalse: Parser[TToken, TOptions, TValue]
  ): Parser[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("condition")(cond.asInstanceOf[js.Any], pTrue.asInstanceOf[js.Any], pFalse.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def decide[TToken, TOptions, TValue](p: Parser[TToken, TOptions, Parser[TToken, TOptions, TValue]]): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("decide")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def discard[TToken, TOptions](ps: (Parser[TToken, TOptions, Any])*): Parser[TToken, TOptions, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("discard")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, Any]]
  
  inline def eitherOr[TToken, TOptions, TValueA, TValueB](pa: Parser[TToken, TOptions, TValueA], pb: Parser[TToken, TOptions, TValueB]): Parser[TToken, TOptions, TValueA | TValueB] = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherOr")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValueA | TValueB]]
  
  inline def eitherOr_TTokenTOptionsTValueATValueB_Matcher[TToken, TOptions, TValueA, TValueB](pa: Parser[TToken, TOptions, TValueA], pb: Matcher[TToken, TOptions, TValueB]): Matcher[TToken, TOptions, TValueA | TValueB] = (^.asInstanceOf[js.Dynamic].applyDynamic("eitherOr")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TValueA | TValueB]]
  
  inline def emit[TToken, TOptions, TValue](value: TValue): Matcher[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(value.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def end[TToken, TOptions](data: Data[TToken, TOptions], i: Double): Result[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Result[`true`]]
  
  inline def eof[TToken, TOptions](data: Data[TToken, TOptions], i: Double): Result[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("eof")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Result[`true`]]
  
  inline def error[TToken, TOptions](message: String): Matcher[TToken, TOptions, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, scala.Nothing]]
  inline def error[TToken, TOptions](message: js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, String]): Matcher[TToken, TOptions, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, scala.Nothing]]
  
  inline def fail[TToken, TOptions](data: Data[TToken, TOptions], i: Double): NonMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[NonMatch]
  
  inline def flatten[TToken, TOptions, TValue](ps: (Parser[TToken, TOptions, TValue | js.Array[TValue]])*): Parser[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, js.Array[TValue]]]
  
  inline def flatten1[TToken, TOptions, TValue](p: Parser[TToken, TOptions, js.Array[TValue | js.Array[TValue]]]): Parser[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten1")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, js.Array[TValue]]]
  
  inline def flatten1_TTokenTOptionsTValue_Matcher[TToken, TOptions, TValue](p: Matcher[TToken, TOptions, js.Array[TValue | js.Array[TValue]]]): Matcher[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten1")(p.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def flatten_TTokenTOptionsTValue_Matcher[TToken, TOptions, TValue](ps: (Matcher[TToken, TOptions, TValue | js.Array[TValue]])*): Matcher[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def left[TToken, TOptions, TValueA, TValueB](pa: Parser[TToken, TOptions, TValueA], pb: Parser[TToken, TOptions, TValueB]): Parser[TToken, TOptions, TValueA] = (^.asInstanceOf[js.Dynamic].applyDynamic("left")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValueA]]
  
  inline def leftAssoc1[TToken, TOptions, TLeft](
    pLeft: Parser[TToken, TOptions, TLeft],
    pOper: Parser[TToken, TOptions, js.Function1[/* x */ TLeft, TLeft]]
  ): Parser[TToken, TOptions, TLeft] = (^.asInstanceOf[js.Dynamic].applyDynamic("leftAssoc1")(pLeft.asInstanceOf[js.Any], pOper.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TLeft]]
  
  inline def leftAssoc2[TToken, TOptions, TLeft, TRight](
    pLeft: Parser[TToken, TOptions, TLeft],
    pOper: Parser[TToken, TOptions, js.Function2[/* x */ TLeft, /* y */ TRight, TLeft]],
    pRight: Parser[TToken, TOptions, TRight]
  ): Parser[TToken, TOptions, TLeft] = (^.asInstanceOf[js.Dynamic].applyDynamic("leftAssoc2")(pLeft.asInstanceOf[js.Any], pOper.asInstanceOf[js.Any], pRight.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TLeft]]
  
  inline def longest[TToken, TOptions, TValue](ps: (Parser[TToken, TOptions, TValue])*): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("longest")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def lookAhead[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue]): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookAhead")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def lookAhead_TTokenTOptionsTValue_Matcher[TToken, TOptions, TValue](p: Matcher[TToken, TOptions, TValue]): Matcher[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookAhead")(p.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def make[TToken, TOptions, TValue](
    /**
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array.
    */
  f: js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, TValue]
  ): Matcher[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(f.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def many[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue]): Matcher[TToken, TOptions, js.Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("many")(p.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def many1[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue]): Parser[TToken, TOptions, Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("many1")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, Array[TValue]]]
  
  inline def map[TToken, TOptions, TValue1, TValue2](
    p: Parser[TToken, TOptions, TValue1],
    /**
    * @param v - A value matched by the base parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the first parser matched).
    * @param j - Parser position in the tokens array (after the first parser matched).
    */
  mapper: js.Function4[
      /* v */ TValue1, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      TValue2
    ]
  ): Parser[TToken, TOptions, TValue2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(p.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue2]]
  
  inline def map1[TToken, TOptions, TValue1, TValue2](
    p: Parser[TToken, TOptions, TValue1],
    /**
    * @param m - A {@link Match} object from the base parser (contains the value and the position after the match).
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the first parser matched).
    * @returns A transformed {@link Result} object - either {@link Match} or {@link NonMatch}.
    */
  mapper: js.Function3[
      /* m */ Match_[TValue1], 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      Result[TValue2]
    ]
  ): Parser[TToken, TOptions, TValue2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map1")(p.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue2]]
  
  inline def map_TTokenTOptionsTValue1TValue2_Matcher[TToken, TOptions, TValue1, TValue2](
    p: Matcher[TToken, TOptions, TValue1],
    /**
    * @param v - A value matched by the base parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the first parser matched).
    * @param j - Parser position in the tokens array (after the first parser matched).
    */
  mapper: js.Function4[
      /* v */ TValue1, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      TValue2
    ]
  ): Matcher[TToken, TOptions, TValue2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(p.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TValue2]]
  
  inline def `match`[TToken, TOptions, TValue](matcher: Matcher[TToken, TOptions, TValue], tokens: js.Array[TToken], options: TOptions): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(matcher.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  inline def middle[TToken, TOptions, TValueA, TValueB, TValueC](
    pa: Parser[TToken, TOptions, TValueA],
    pb: Parser[TToken, TOptions, TValueB],
    pc: Parser[TToken, TOptions, TValueC]
  ): Parser[TToken, TOptions, TValueB] = (^.asInstanceOf[js.Dynamic].applyDynamic("middle")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any], pc.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValueB]]
  
  inline def not[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue]): Parser[TToken, TOptions, `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, `true`]]
  
  inline def of[TToken, TOptions, TValue](value: TValue): Matcher[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def option[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue], `def`: TValue): Matcher[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(p.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def or[TToken, TOptions, TValue](ps: (Parser[TToken, TOptions, TValue])*): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def otherwise[TToken, TOptions, TValueA, TValueB](pa: Parser[TToken, TOptions, TValueA], pb: Parser[TToken, TOptions, TValueB]): Parser[TToken, TOptions, TValueA | TValueB] = (^.asInstanceOf[js.Dynamic].applyDynamic("otherwise")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValueA | TValueB]]
  
  inline def otherwise_TTokenTOptionsTValueATValueB_Matcher[TToken, TOptions, TValueA, TValueB](pa: Parser[TToken, TOptions, TValueA], pb: Matcher[TToken, TOptions, TValueB]): Matcher[TToken, TOptions, TValueA | TValueB] = (^.asInstanceOf[js.Dynamic].applyDynamic("otherwise")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TValueA | TValueB]]
  
  inline def parse[TToken, TOptions, TValue](parser: Parser[TToken, TOptions, TValue], tokens: js.Array[TToken], options: TOptions): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TValue]
  inline def parse[TToken, TOptions, TValue](
    parser: Parser[TToken, TOptions, TValue],
    tokens: js.Array[TToken],
    options: TOptions,
    formatToken: js.Function1[/* t */ TToken, String]
  ): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any], formatToken.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  inline def parserPosition[TToken](data: Data[TToken, Any], i: Double, formatToken: js.Function1[/* t */ TToken, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parserPosition")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any], formatToken.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parserPosition[TToken](
    data: Data[TToken, Any],
    i: Double,
    formatToken: js.Function1[/* t */ TToken, String],
    contextTokens: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parserPosition")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any], formatToken.asInstanceOf[js.Any], contextTokens.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def peek[TToken, TOptions, TValue](
    p: Parser[TToken, TOptions, TValue],
    /**
    * @param r - A {@link Result} object after running the base parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the first parser matched).
    */
  f: js.Function3[/* r */ Result[TValue], /* data */ Data[TToken, TOptions], /* i */ Double, Unit]
  ): Parser[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("peek")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def peek_TTokenTOptionsTValue_Matcher[TToken, TOptions, TValue](
    p: Matcher[TToken, TOptions, TValue],
    /**
    * @param r - A {@link Result} object after running the base parser.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the first parser matched).
    */
  f: js.Function3[/* r */ Match_[TValue], /* data */ Data[TToken, TOptions], /* i */ Double, Unit]
  ): Matcher[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("peek")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def recursive[TToken, TOptions, TValue](f: js.Function0[Parser[TToken, TOptions, TValue]]): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(f.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def recursive_TTokenTOptionsTValue_Matcher[TToken, TOptions, TValue](f: js.Function0[Matcher[TToken, TOptions, TValue]]): Matcher[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(f.asInstanceOf[js.Any]).asInstanceOf[Matcher[TToken, TOptions, TValue]]
  
  inline def reduceLeft[TToken, TOptions, TAcc, TValue](
    acc: TAcc,
    p: Parser[TToken, TOptions, TValue],
    /**
    * @param acc - Accumulated value.
    * @param v - Value from each successful parsing.
    * @param data - Data object (tokens and options).
    * @param i - Position before current match.
    * @param j - Position after current match.
    */
  reducer: js.Function5[
      /* acc */ TAcc, 
      /* v */ TValue, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      TAcc
    ]
  ): Matcher[TToken, TOptions, TAcc] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceLeft")(acc.asInstanceOf[js.Any], p.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TAcc]]
  
  inline def reduceRight[TToken, TOptions, TValue, TAcc](
    p: Parser[TToken, TOptions, TValue],
    acc: TAcc,
    /**
    * @param v - Value from each successful parsing.
    * @param acc - Accumulated value.
    * @param data - Data object (tokens and options).
    * @param i - Position before all successful parsings.
    * @param j - Position after all successful parsings.
    */
  reducer: js.Function5[
      /* v */ TValue, 
      /* acc */ TAcc, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      TAcc
    ]
  ): Matcher[TToken, TOptions, TAcc] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(p.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, TAcc]]
  
  inline def remainingTokensNumber[TToken](data: Data[TToken, Any], i: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remainingTokensNumber")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def right[TToken, TOptions, TValueA, TValueB](pa: Parser[TToken, TOptions, TValueA], pb: Parser[TToken, TOptions, TValueB]): Parser[TToken, TOptions, TValueB] = (^.asInstanceOf[js.Dynamic].applyDynamic("right")(pa.asInstanceOf[js.Any], pb.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValueB]]
  
  inline def rightAssoc1[TToken, TOptions, TRight](
    pOper: Parser[TToken, TOptions, js.Function1[/* y */ TRight, TRight]],
    pRight: Parser[TToken, TOptions, TRight]
  ): Parser[TToken, TOptions, TRight] = (^.asInstanceOf[js.Dynamic].applyDynamic("rightAssoc1")(pOper.asInstanceOf[js.Any], pRight.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TRight]]
  
  inline def rightAssoc2[TToken, TOptions, TLeft, TRight](
    pLeft: Parser[TToken, TOptions, TLeft],
    pOper: Parser[TToken, TOptions, js.Function2[/* x */ TLeft, /* y */ TRight, TRight]],
    pRight: Parser[TToken, TOptions, TRight]
  ): Parser[TToken, TOptions, TRight] = (^.asInstanceOf[js.Dynamic].applyDynamic("rightAssoc2")(pLeft.asInstanceOf[js.Any], pOper.asInstanceOf[js.Any], pRight.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TRight]]
  
  inline def satisfy[TToken, TOptions](
    /**
    * @param token - A token at the parser position.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (points at the same token).
    */
  test: js.Function3[/* token */ TToken, /* data */ Data[TToken, TOptions], /* i */ Double, Boolean]
  ): Parser[TToken, TOptions, TToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("satisfy")(test.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, TToken]]
  
  inline def sepBy[TToken, TOptions, TValue, TSep](pValue: Parser[TToken, TOptions, TValue], pSep: Parser[TToken, TOptions, TSep]): Matcher[TToken, TOptions, js.Array[TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sepBy")(pValue.asInstanceOf[js.Any], pSep.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def sepBy1[TToken, TOptions, TValue, TSep](pValue: Parser[TToken, TOptions, TValue], pSep: Parser[TToken, TOptions, TSep]): Parser[TToken, TOptions, Array[TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sepBy1")(pValue.asInstanceOf[js.Any], pSep.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, Array[TValue]]]
  
  inline def skip[TToken, TOptions](ps: (Parser[TToken, TOptions, Any])*): Parser[TToken, TOptions, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(ps.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parser[TToken, TOptions, Any]]
  
  inline def some[TToken, TOptions, TValue](p: Parser[TToken, TOptions, TValue]): Parser[TToken, TOptions, Array[TValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(p.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, Array[TValue]]]
  
  inline def start[TToken, TOptions](data: Data[TToken, TOptions], i: Double): Result[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(data.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[Result[`true`]]
  
  inline def takeUntil[TToken, TOptions, TValue](
    p: Parser[TToken, TOptions, TValue],
    /**
    * @param value - Current value matched by the parser.
    * @param n - Number of matches so far (including the current value).
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the current value matched).
    * @param j - Parser position in the tokens array (after the current value matched).
    */
  test: js.Function5[
      /* value */ TValue, 
      /* n */ Double, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      Boolean
    ]
  ): Matcher[TToken, TOptions, js.Array[TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(p.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def takeUntilP[TToken, TOptions, TValue](pValue: Parser[TToken, TOptions, TValue], pTest: Parser[TToken, TOptions, Any]): Matcher[TToken, TOptions, js.Array[TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeUntilP")(pValue.asInstanceOf[js.Any], pTest.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def takeWhile[TToken, TOptions, TValue](
    p: Parser[TToken, TOptions, TValue],
    /**
    * @param value - Current value matched by the parser.
    * @param n - Number of matches so far (including the current value).
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (before the current value matched).
    * @param j - Parser position in the tokens array (after the current value matched).
    */
  test: js.Function5[
      /* value */ TValue, 
      /* n */ Double, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      /* j */ Double, 
      Boolean
    ]
  ): Matcher[TToken, TOptions, js.Array[TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(p.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def takeWhileP[TToken, TOptions, TValue](pValue: Parser[TToken, TOptions, TValue], pTest: Parser[TToken, TOptions, Any]): Matcher[TToken, TOptions, js.Array[TValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhileP")(pValue.asInstanceOf[js.Any], pTest.asInstanceOf[js.Any])).asInstanceOf[Matcher[TToken, TOptions, js.Array[TValue]]]
  
  inline def token[TToken, TOptions, TValue](
    /**
    * @param token - A token at the parser position.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (points at the same token).
    */
  onToken: js.Function3[
      /* token */ TToken, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      js.UndefOr[TValue]
    ]
  ): Parser[TToken, TOptions, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(onToken.asInstanceOf[js.Any]).asInstanceOf[Parser[TToken, TOptions, TValue]]
  inline def token[TToken, TOptions, TValue](
    /**
    * @param token - A token at the parser position.
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (points at the same token).
    */
  onToken: js.Function3[
      /* token */ TToken, 
      /* data */ Data[TToken, TOptions], 
      /* i */ Double, 
      js.UndefOr[TValue]
    ],
    /**
    * @param data - Data object (tokens and options).
    * @param i - Parser position in the tokens array (naturally points after the end of array).
    */
  onEnd: js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, Unit]
  ): Parser[TToken, TOptions, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(onToken.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[Parser[TToken, TOptions, TValue]]
  
  inline def tryParse[TToken, TOptions, TValue](parser: Parser[TToken, TOptions, TValue], tokens: js.Array[TToken], options: TOptions): js.UndefOr[TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(parser.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TValue]]
  
  trait Data[TToken, TOptions] extends StObject {
    
    /** Parser options object. */
    var options: TOptions
    
    /** Tokens array - the subject of parsing. */
    var tokens: js.Array[TToken]
  }
  object Data {
    
    inline def apply[TToken, TOptions](options: TOptions, tokens: js.Array[TToken]): Data[TToken, TOptions] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[TToken, TOptions]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?, ?], TToken, TOptions] (val x: Self & (Data[TToken, TOptions])) extends AnyVal {
      
      inline def setOptions(value: TOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[TToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: TToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait Match_[TValue]
    extends StObject
       with Result[TValue] {
    
    var matched: `true`
    
    /** Parser position after this match. */
    var position: Double
    
    /** Matched value. */
    var value: TValue
  }
  object Match_ {
    
    inline def apply[TValue](position: Double, value: TValue): Match_[TValue] = {
      val __obj = js.Dynamic.literal(matched = true, position = position.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match_[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match_[?], TValue] (val x: Self & Match_[TValue]) extends AnyVal {
      
      inline def setMatched(value: `true`): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Matcher[TToken, TOptions, TValue] = js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, Match_[TValue]]
  
  trait NonMatch
    extends StObject
       with Result[Any] {
    
    var matched: `false`
  }
  object NonMatch {
    
    inline def apply(): NonMatch = {
      val __obj = js.Dynamic.literal(matched = false)
      __obj.asInstanceOf[NonMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NonMatch] (val x: Self) extends AnyVal {
      
      inline def setMatched(value: `false`): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    }
  }
  
  type Parser[TToken, TOptions, TValue] = js.Function2[/* data */ Data[TToken, TOptions], /* i */ Double, Result[TValue]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.peberminta.mod.Match_[TValue]
    - typings.peberminta.mod.NonMatch
  */
  trait Result[TValue] extends StObject
  object Result {
    
    inline def Match_[TValue](position: Double, value: TValue): typings.peberminta.mod.Match_[TValue] = {
      val __obj = js.Dynamic.literal(matched = true, position = position.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.peberminta.mod.Match_[TValue]]
    }
    
    inline def NonMatch(): typings.peberminta.mod.NonMatch = {
      val __obj = js.Dynamic.literal(matched = false)
      __obj.asInstanceOf[typings.peberminta.mod.NonMatch]
    }
  }
}
