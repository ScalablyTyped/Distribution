
# Scala.js typings for parsimmon

Typings are for version 1.10

## Library description:
A monadic LL(infinity) parser combinator library

|                    |                 |
| ------------------ | :-------------: |
| Full name          | parsimmon |
| Keywords           | parsing, parse, parsers, parser combinators |
| # releases         | 19 |
| # dependents       | 61 |
| # downloads        | 877985 |
| # stars            | 2 |

## Links
- [Homepage](https://github.com/jneen/parsimmon#readme)
- [Bugs](https://github.com/jneen/parsimmon/issues)
- [Repository](https://github.com/jneen/parsimmon)
- [Npm](https://www.npmjs.com/package/parsimmon)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for Parsimmon 1.10
// Project: https://github.com/jneen/parsimmon
// Definitions by: Bart van der Schoor <https://github.com/Bartvds>
//                 Mizunashi Mana <https://github.com/mizunashi-mana>
//                 Boris Cherny <https://github.com/bcherny>
//                 Benny van Reeven <https://github.com/bvanreeven>
//                 Leonard Thieu <https://github.com/leonard-thieu>
//                 Jonathan Frere <https://github.com/MrJohz>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3
/**
 * **NOTE:** You probably will never need to use this function. Most parsing
 * can be accomplished using `Parsimmon.regexp` and combination with
 * `Parsimmon.seq` and `Parsimmon.alt`.
 *
 * You can add a primitive parser (similar to the included ones) by using
 * `Parsimmon(fn)`. This is an example of how to create a parser that matches
 * any character except the one provided:
 *
 * ```javascript
 * function notChar(char) {
 *   return Parsimmon(function(input, i) {
 *     if (input.charAt(i) !== char) {
 *       return Parsimmon.makeSuccess(i + 1, input.charAt(i));
 *     }
 *     return Parsimmon.makeFailure(i, 'anything different than "' + char + '"');
 *   });
 * }
 * ```
 *
 * This parser can then be used and composed the same way all the existing
 * ones are used and composed, for example:
 *
 * ```javascript
 * var parser =
 *   Parsimmon.seq(
 *     Parsimmon.string('a'),
 *     notChar('b').times(5)
 *   );
 * parser.parse('accccc');
 * //=> {status: true, value: ['a', ['c', 'c', 'c', 'c', 'c']]}
 * ```
 */

```

