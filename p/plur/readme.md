
# Scala.js typings for plur

Typings are for version 3.1.1

## Library description:
Pluralize a word

|                    |                 |
| ------------------ | :-------------: |
| Full name          | plur |
| Keywords           | plural, plurals, pluralize, singular, count, word, string, irregular, noun, nouns |
| # releases         | 3 |
| # dependents       | 96 |
| # downloads        | 38158092 |
| # stars            | 7 |

## Links
- [Homepage](https://github.com/sindresorhus/plur#readme)
- [Bugs](https://github.com/sindresorhus/plur/issues)
- [Repository](https://github.com/sindresorhus/plur)
- [Npm](https://www.npmjs.com/package/plur)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Pluralize a word.

@param word - Word to pluralize.
@param plural - Pluralized word.
The plural suffix will match the case of the last letter in the word.
This option is only for extreme edge-cases. You probably won't need it.

Default:

- Irregular nouns will use this [list](https://github.com/sindresorhus/irregular-plurals/blob/master/irregular-plurals.json).
- Words ending in *s*, *x*, *z*, *ch*, *sh* will be pluralized with *-es* (eg. *foxes*).
- Words ending in *y* that are preceded by a consonant will be pluralized by replacing *y* with *-ies* (eg. *puppies*).
- All other words will have "s" added to the end (eg. *days*).

@param count - Count to determine whether to use singular or plural.

@example
```
import plur = require('plur');

plur('unicorn', 4);
//=> 'unicorns'

plur('puppy', 2);
//=> 'puppies'

plur('box', 2);
//=> 'boxes'

plur('cactus', 2);
//=> 'cacti'
```
 */

```

