
# Scala.js typings for nanoid

Typings are for version 1.2

## Library description:
A tiny (141 bytes), secure URL-friendly unique string ID generator

|                    |                 |
| ------------------ | :-------------: |
| Full name          | nanoid |
| Keywords           | uuid, random, id, url |
| # releases         | 31 |
| # dependents       | 343 |
| # downloads        | 21058714 |
| # stars            | 16 |

## Links
- [Homepage](https://github.com/ai/nanoid#readme)
- [Bugs](https://github.com/ai/nanoid/issues)
- [Repository](https://github.com/ai/nanoid)
- [Npm](https://www.npmjs.com/package/nanoid)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for nanoid 1.2
// Project: https://github.com/ai/nanoid
// Definitions by: Ruben Schmidmeister <https://github.com/bash>
//                 Daniel Zhang <https://github.com/fadezhanger>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * Generate URL-friendly unique ID. This method use non-secure predictable
 * random generator.
 *
 * By default, ID will have 21 symbols to have a collision probability similar
 * to UUID v4.
 *
 * @param alphabet Symbols to be used in ID.
 * @param [size=21] The number of symbols in ID.
 *
 * @return Random string.
 *
 * @example
 * const nanoid = require('nanoid/non-secure')
 * model.id = nanoid() //=> "Uakgb_J5m9g-0JDMbcJqL"
 */
/**
 * Generate URL-friendly unique ID. This method use non-secure predictable
 * random generator.
 *
 * By default, ID will have 21 symbols to have a collision probability similar
 * to UUID v4.
 *
 * @param [size=21] The number of symbols in ID.
 *
 * @return Random string.
 *
 * @example
 * const nanoid = require('nanoid/non-secure')
 * model.id = nanoid() //=> "Uakgb_J5m9g-0JDMbcJqL"
 */

```

