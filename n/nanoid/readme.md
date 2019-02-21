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